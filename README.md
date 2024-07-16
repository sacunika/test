Система управления сотрудниками и должностями
Это приложение разработано для управления сотрудниками и должностями в компании.

Зависимости
Для запуска приложения требуется наличие следующих компонентов:

Java Development Kit (JDK) версии 11 или выше
Скачать и установить с официального сайта: https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
Apache Maven версии 3.8.x
Скачать и установить с официального сайта: https://maven.apache.org/download.cgi
PostgreSQL версии 12 или выше
Скачать и установить с официального сайта: https://www.postgresql.org/download/
IntelliJ IDEA или любая другая Java IDE
Рекомендуемая версия: IntelliJ IDEA 2021.2 или выше
Скачать и установить с официального сайта: https://www.jetbrains.com/idea/download/


Инструкция по запуску
Клонируйте репозиторий с GitHub:
git clone https://github.com/your-username/employee-management-system.git

Перейдите в директорию проекта:
cd employee-management-system

Создайте базу данных PostgreSQL с именем test и настройте подключение к ней в файле application.yaml.

Соберите проект с помощью Maven:
mvn clean install

Запустите приложение:
mvn spring-boot:run
Приложение будет доступно по адресу http://localhost:8080.
