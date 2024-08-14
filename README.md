Santander Dev Week 2023

Diagrama de classes

```mermaid
classDiagram
    class User {
        -String firstName
        -Account account
        -List~Feature~ features
        -List~Card~ cards
        -List~News~ news
    }

    class Account {
        -String agency
        -String number
        -float balance
        -float limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -float limit
    }

    class News {
        -String icon
        -String description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "N" Card
    User "1" *-- "N" News

```
