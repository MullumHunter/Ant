<h1 align="center">Задача с муравьями - кто первым упадет с доски:</h1>

У нас есть деревянная доска длиной n единиц. 
Два муравья ходят по доске, каждый муравей движется со скоростью 1 единица за раунд. 
Один муравей движется влево, другой - вправо. (их направление не зависит от их расположения)
(тоесть они могут идти как навстречу друг другу так и не навстречу)
За один раунд каждый муравей делает свой ход. 
Муравей, идущий слева, двигается первым.
Когда два муравья движутся навстречу друг другу и в какой-то момент встречаются, они меняют направление и снова продолжают движение. 
Предположим, что изменение направления не требует никакого дополнительного раунда. 
Кроме того, муравьи не могут занимать одно и то же положение на доске.
Когда муравей достигает одного конца доски и движется к ее концу, он не выпадает с доски сразу, это происходит в следующем раунде.
Дано целое число n — длина доски и два целых числа: слева — положение муравья, который перемещается влево, и справа — положение муравья, который перемещается вправо. 
Верните количество раундов, необходимое для того, чтобы первый муравей выпал из доски.
