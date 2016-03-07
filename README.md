Pure Java Buck Sample Project
=============================


TODO
----
 * Add tests for resources.
 * Add a commit build in TravisCI

General Issues
--------------
 * When Module1 App depends on Module2 App. IntelliJ add a dependency from Module1 test to Module2 however there is no BUCK dependency defined,
   A work around for this is to make java_test() deps always depend on java_library() deps.
 
Buck project issues
-------------------
 * The root module has a not ideal name of module_
 * BUCK does not generate module iml's with resources and test resources see [Facebook BUCK #577](https://github.com/facebook/buck/pull/577)
 * When buck project is run IntelliJ Idea loses its project SDK.
 * Specify ignored folders in the IntelliJ Project, when calling buck project.
