Pure Java Buck Sample Project
=============================


TODO
----
 * Add tests for resources.
 * Add a commit build in TravisCI

Issues
------
 * BUCK does not generate module iml's with resources and test resources see [Facebook BUCK #577](https://github.com/facebook/buck/pull/577)
 * The root module has a not ideal name of module_
 * When buck project is run IntelliJ Idea loses its project SDK.
 * When Module1 App depends on Module2 App. IntelliJ add a dependency from Module1 test to Module2 however there is no BUCK dependency defined,
   see: com.company.Module1MainTest.shouldNotBeAbleToDependOnModule2
