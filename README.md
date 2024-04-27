Что нужно сделать
В обоих заданиях ниже вам нужно создать локаторы для элементов в java-проекте. Выберите максимально эффективные стратегии поиска локаторов.

Задание 1. Android
Скачайте приложение Zoom.
В java-проекте задайте в capabilities драйвера параметр APP с информацией о местонахождении скачанного приложения.
Откройте эмулятор (разрешение экрана эмулятора должно быть не менее 1440×2560). Если у вас такого нет, создайте (подсказка в разделе «Советы и рекомендации»).
Установите на эмулятор вручную приложение Zoom и найдите локатор кнопки Join a Meeting.
В java-проекте создайте элемент с найденным локатором и вызовите у этого элемента метод click().
На эмуляторе вручную нажмите на кнопку Join a Meeting.
На этом экране найдите все элементы, которые присутствуют в текущей визуализации (кроме виртуальной клавиатуры), скроллить экран для визуализации нижних элементов не нужно: Список необходимых элементов для поиска:
● Кнопка Cancel.

● Заголовок Join a Meeting.

● Поле ввода Meeting ID (класс LinearLayout).

● Текст Join with a personal link name.

● Поле ввода с текстом sdk_gphone. (класс LinearLayout).

● Кнопка Join.

● Текст под кнопкой Join.

● Заголовок Join Options.

● Текст Don’t Connect To Audio.

● Переключатель рядом с текстом Don’t Connect To Audio.

В java-проекте создайте и инициализируйте все элементы текущего экрана с локаторами, которые, на ваш взгляд, максимально эффективны, используя знания, полученные в модулях 3 и 4.
Первые пять элементов объявите с помощью аннотаций, остальные — с помощью методов драйвера.
Проверьте, что элементы отображаются на экране с помощью вызова у элемента метода isDisplayed().
Запустите ваш тест и проверьте, что он сам запускает приложение на эмуляторе, нажимает кнопку Join a Meeting, а затем просто удачно завершается, найдя все элементы на экране.