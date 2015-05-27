MovieJukebox SQL DB
===================

Author: Stuart Boston (Omertron AT Gmail DOT com)

Originally written for use by YetAnotherMovieJukebox ([YAMJv2](https://github.com/YAMJ/yamj-v2) & [YAMJv3](https://github.com/YAMJ/yamj-v3)), but anyone can feel free to use it for other projects as well.

Instructions / Usage
--------------------

This is a fairly rudimentary interface to create a create a database

When adding or changing a column to one of the Data Type Objects:
1) Update tools/DatabaseTools/createTables
2) Update dto/CLASS and add a getter/setter and update the constuctor
3) Update dbWriter/INSERT_??? field with the new column
4) Update dbWriter/insert??? with the new column

Project Logging
---------------
This project uses [SLF4J](http://www.slf4j.org) to abstract the logging in the project.

To use the logging in your own project you should add one of the bindings listed [HERE](http://www.slf4j.org/manual.html#swapping)
