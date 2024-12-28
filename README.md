# Unexpected Behavior with Partial Function Application in Scala

This example demonstrates a potential pitfall when using partial function application in Scala. While generally a powerful feature, it can lead to unexpected results if not handled with care, particularly when dealing with mutable state or side effects.  The `BugPartialFunction.scala` file showcases a scenario where the partially applied function retains a reference to the original object's state, leading to unintended consequences if the object's state changes later. The `SolutionPartialFunction.scala` file provides a possible solution to mitigate this problem.

## Problem

The primary issue arises from the way partial function application creates a closure. This closure maintains a reference to the original object's state.  If that state is modified, the partially applied function will reflect these changes, potentially producing unexpected behavior.