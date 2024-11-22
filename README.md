Я разделил задачу на части:
Считывание данных: Для ввода массива строк используется Scanner.
Обработка массива: Подсчёт количества строк, соответствующих условию.
Создание нового массива нужной длины.
Вывод результата: Отдельный метод для форматированного вывода массива.

Как решены задачи из примеров.
Пример 1: ["Hello", "2", "world", ":-)"]
Вводится массив длиной 4.
На этапе фильтрации выбираются строки ["2", ":-)"] (длина ≤ 3).
Новый массив создаётся с размером 2 и заполняется.
Пример 2: ["1234", "1567", "-2", "computer science"]
Вводится массив длиной 4.
На этапе фильтрации остаётся только ["-2"].
Новый массив создаётся с размером 1 и заполняется.
Пример 3: ["Russia", "Denmark", "Kazan"]
Все строки длиннее 3 символов, поэтому результат пустой массив [].
