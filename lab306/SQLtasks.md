Here are three tasks that can be performed with native SQL but not with JPQL:

Database Schema Operations: SQL allows you to perform database schema operations such as creating, modifying, or dropping tables, indexes, and constraints. These operations are not supported by JPQL, which is primarily focused on querying entities and managing their relationships. 

Bulk Operations: SQL provides efficient ways to perform bulk operations such as bulk inserts, updates, or deletes, which can significantly improve performance when dealing with large datasets. While JPQL supports bulk updates and deletes through its UPDATE and DELETE statements, native SQL often provides more fine-grained control and better performance for these operations.

Stored Procedures and Functions: Many databases support stored procedures and functions, which are precompiled sets of SQL statements that can be executed by the database engine. These stored procedures and functions can encapsulate complex logic and calculations, and they can be invoked from SQL queries or application code.
While you can execute native SQL queries in JPA using the EntityManager, you would need to resort to native SQL to call stored procedures or functions directly.