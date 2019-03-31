# spring boot demo
- h2 (test database)
- jpa
- springfox api
- spring boot test

# Q&A
- 1. could not initialize proxy :no session
- - Use @Transactional to annotate function

- 2. physical_naming_strategy config
- - Set toPhysicalColumnName to convert column name to database table column name: aB => a_b