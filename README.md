# Stellar Burgers unit-tests

Тестирование учебного сервиса, которая помогает заказать бургер в Stellar Burgers, покрытие её юнит-тестами.

## Описание

Версия Java 11.

В проекте используется библиотека:

- JUnit 4
- Jacoco
- Mockito

## Запуск автотестов
Для запуска автотеста необходимо:

1. Склонировать репозиторий на свой компьютер с помощью команды:

 ```sh
git clone git@github.com:Whufirefly/QA-java-diplom-1.git
```

2. Для создания отчета в Jacoco ввести команду

```sh   
mvn clean verify
```

## Выполненные задачи
* Склонирован репозиторий с заготовкой кода.
* Подключены библиотеки: Jacoco, Mockito, JUnit 4.
* Покрыты тестами классы Bun, Burger, Ingredient, IngredientType.
* Процент покрытия должен быть не ниже 80%.

#### Посмотреть отчёт Jacoco
Он показывает % покрытия кода. 
Этот отчет нужно открыть в браузере. 
Выполняем команду mvn verify : для этого в IDEA нажми Ctrl дважды. 
Откроется окно: пишем в нём эту команду.
Находим в папке target/site/jacoco/ файл index.html, 
нажми на него правой кнопкой мыши и выбираем Open In — Browser — наш браузер.

#### Добавляем папку с отчетом Jacoco к отслеживаемым файлам. Ключ -f пригодится, если папка target указана в .gitignore
git add -f .\target\site\jacoco\.
#### выполняем коммит
git commit -m "add jacoco report"
#### отправляем файлы в удалённый репозиторий
git push 