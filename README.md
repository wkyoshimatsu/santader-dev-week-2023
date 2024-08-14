Santander Dev Week 2023

Diagrama de classes

```mermaid
classDiagram
    class User {
        -String firstName
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

    class BankUser {
        -User user
        -Account account
        -List~Feature~ features
        -List~Card~ cards
        -List~News~ news
    }

    BankUser "1" *-- "1" User
    BankUser "1" *-- "1" Account
    BankUser "1" *-- "N" Feature : features*
    BankUser "1" *-- "N" Card : cards*
    BankUser "1" *-- "N" News : news*

```
