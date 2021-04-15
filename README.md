### Задание

1. Реализовать функцию `pointCount()` в классе `com.qligent.point.count.service.PointCountService`. 
Функция должна находит количество точек внутри окружности или на ее границе. 

   На вход фукнция принимает `com.qligent.point.count.dto.Input`, состоящий из 4 параметров:
    
   `initialPoint` - координаты начальной точки
     
   `radius` - радиус окружности, которая будет нарисована из точки
     
   `region` - размер области, которым ограничена наша система координат. Задается 2-мя точками 
   (левый верхний угол и правый нижний).
     
   `points` -  массив точек, для которых нужно понять, какие лежат в окружности, а какие нет
      
   Если радиус больше размера области, то ограничиваем окружность размером области.
 
2. Необходимо реализовать проверку правильности введения входных параметров. 
В случае, если входные параметры введены неверно, необходимо выбрасывать исключение 
`com.qligent.point.count.exception.WrongInputException`


3. В классе `com.qligent.point.count.PointCountServiceTest` 
необходимо написать тесты (пример теста представлен) для функции из п.1 и валидацию входных параметров из п.2. 
 

### Как запустить программу.

1. Собрать проект (запуск из корня проекта):

    ```bash
    ./gradlew clean build -x test
    ```

2. Запустить тесты

    ```bash
    ./gradlew test
    ``` 
   
   Если все тесты пройдены, значит функция и проверка входных параметров реализованы верно.

