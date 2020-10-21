# coroutine_bug_fixing
I need help to solve coroutine: Error message
1) e: org.jetbrains.kotlin.codegen.CompilationException: Back-end (JVM) Internal error: wrong bytecode generated
2) Caused by: org.jetbrains.kotlin.codegen.CompilationException: Back-end (JVM) Internal error: Couldn't transform method node:
3) Caused by: java.lang.AssertionError: AFTER mandatory stack transformations: incorrect bytecode
4) Caused by: java.lang.RuntimeException: org.jetbrains.org.objectweb.asm.tree.analysis.AnalyzerException: Error at instruction 58: Expected an object reference, but found I
5) Caused by: org.jetbrains.org.objectweb.asm.tree.analysis.AnalyzerException: Error at instruction 58: Expected an object reference, but found I
6) Caused by: org.jetbrains.org.objectweb.asm.tree.analysis.AnalyzerException: Expected an object reference, but found I
7) Compilation error. See log for more details

