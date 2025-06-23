<img src="img/Scope.svg" alt="Scope Logo"/>

*Scope*  是一个面向对象的编程语言，其编译器用 Java 实现，目标是将 Scope 代码编译为 FASM 汇编，再生成可执行文件。项目采用模块化设计，便于扩展和维护。

> **Warning**
>
> Scope currently only runs on Linux. Use WSL2 for Windows. Other platforms are planned.

## 项目结构

mycompiler/
├── src/
│   ├── main/
│   │   ├── antlr4/
│   │   │   └── com/scopelang/Scope.g4         # 语言语法定义（ANTLR4语法文件）
│   │   └── java/
│   │       └── com/scopelang/
│   │           ├── error/                     # 错误处理相关
│   │           ├── fasm/                      # 汇编生成与求值相关
│   │           ├── metadata/                  # 元数据与导入管理
│   │           ├── preprocess/                # 预处理与符号收集
│   │           ├── project/                   # 项目编译与管理
│   │           ├── FilePair.java              # 文件对管理
│   │           ├── Identifier.java            # 标识符处理
│   │           ├── Modules.java               # 模块管理
│   │           ├── Scope.java                 # 编译器主入口
│   │           ├── ScopeType.java             # 类型系统
│   │           └── Utils.java                 # 工具类
│   └── test/
│       └── java/com/scopelang/ScopeTest.java  # 测试代码
├── env/                                       # 示例项目与测试环境
│   ├── helloWorld/
│   ├── hangman/
│   ├── test/
│   └── testlib/
├── target/                                    # 编译输出目录
├── pom.xml                                    # Maven 构建配置
├── install                                    # 安装脚本
├── README.md                                  # 项目说明


## 主要模块说明

# 1. 语法定义（ANTLR4）
src/main/antlr4/com/scopelang/Scope.g4
使用 ANTLR4 定义 Scope 语言的词法和语法规则。编译后生成词法分析器、语法分析器等 Java 文件。
# 2. 编译主流程
Scope.java
编译器主入口，负责参数解析、编译流程调度、错误捕获等。
project/
CompileTask.java、ProjectCompileTask.java、ScopeXml.java
负责 Scope 项目的整体编译任务管理、项目配置解析（如 scope.xml）、多文件编译等。
# 3. 预处理与符号收集
preprocess/
包含符号收集器（如常量、函数、对象）、预处理器、Token 处理等，负责在语法树生成后进行符号表构建和语义检查。
# 4. 汇编生成与求值
fasm/
FasmGenerator.java
负责将 Scope 的中间表示(IR)转换为 FASM 汇编代码， 限制在Linux环境
ExprEvaluator.java、AtomEvaluator.java、LiteralEvaluator.java
负责表达式、原子、字面量的求值与翻译。
Codeblock.java
管理汇编代码块、标签、变量等。
# 5. 元数据与导入
metadata/
FasmAnalyzer.java、ImportManager.java
负责分析汇编元数据、管理模块/库的导入与依赖。
# 6. 错误处理
error/
ErrorHandler.java、ErrorLoc.java
统一的错误处理与定位机制，便于调试和用户提示。
# 7. 工具与类型系统
Utils.java
提供通用工具方法。
ScopeType.java
定义 Scope 语言的类型系统。
# 8. 示例与测试
env/
包含多个示例项目（如 helloWorld、hangman），每个项目有独立的 scope.xml 配置和源码，便于测试和演示。
src/test/java/com/scopelang/ScopeTest.java
单元测试，确保编译器核心功能的正确性。

## 编译与运行

依赖:
- `java`
$ sudo apt install openjdk-17-jdk 
- `maven`
$ sudo apt install maven
- `fasm`
$ sudo apt install fasm
After these are installed, run:

项目构建
$ mvn package
会产生target/scopelang-1.0-jar-with-dependencies.jar的jar包

编译运行命令示例:
$ ./scope run -d helloWorld
# 或直接用 jar 包
$ java -jar target/scopelang-1.0-jar-with-dependencies.jar run -d env/helloWorld

可以通过安装编译器在开发机上全局使用：
$ sudo ./install
