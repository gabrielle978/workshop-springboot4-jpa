# ☕Projeto web services com Spring Boot e JPA / Hibernate 

## 🎯Objetivos 
- Criar projeto Spring Boot Java
- Implementar modelo de domínio
- Estruturar camadas lógicas: resource, service, repository 
- Configurar banco de dados de teste (H2) 
- Povoar o banco de dados 
- CRUD - Create, Retrieve, Update, Delete 
- Tratamento de exceções

## 🔨Ferramentas Utilizadas
- SpringBoot
- Apache TomCat
- Maven
- H2 (database)
- Heroku
- Postman
- PostgreSQL


> [!NOTE]
> - [x] **_Spring Initializr_**   [Maven  |Java 17 |Packing JAR | Dependencies: Spring Web]
> - [x] **_User entity and resource_**  [Basic attributes |Associations(instantiate collections) |Constructors |Getters & Setters(collections: only get) |hashCode & equals | Serializable]
> - [x] **_H2 database, test profile, JPA_** [JPA & H2 dependencies |application.properties |application-test.properties |Entity: JPA mapping]
> - [x] **_JPA repository, dependency injection, database seeding_** [UserRepository extends JPARepository<User, Long> |Configuration class for "test" profile |@Autowired UserRepository |Instantiate objects in memory |Persist objects]
> - [x] **_Order, Instant, ISO 8601_** [Entity -> "To many" association, lazy loading, JsonIgnore |RepositorySeed |Service |Resource]
> - [x] **_OrderStatus enum_**
> - [x] **_Entity Category, Product_**
> - [x] **_Many-to-many association with JoinTable_**
> - [x]  **_OrderItem, many-to-many association with extra attributes_** [OrderItemPK | OrderItem |Order one-to-many-association | Seed]
> - [x]  **_Product-OrderItem one-to-many association_**
> - [x]  **_Payment, one-to-one association_**
> - [x]  **_Subtotal & Total methods_**
> - [ ]  **_User insert / User delete / User update_** 
