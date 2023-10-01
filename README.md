##Programación con Objetos - App Geometría
###Enunciado
A.- Implementar un módulo para una aplicación de geometría plana. Nos piden que modelemos la clase Figura y además, como especializaciones de Figura, las clases Elipse, Círculo, Triángulo, Rectángulo y Cuadrado.

Cabe la aclaración que cada figura tiene sus características puntuales, a saber:
Las elipses deben almacenar el centro (es un punto) y la medida de los radios. 
Los rectángulos deben almacenar el punto de la esquina inferior izquierda y el punto de la esquina superior derecha.
Los triángulos deben almacenar los tres vértices.
Los círculos son elipses donde ambos radios deben ser iguales y los cuadrados son rectángulos donde base y altura deben medir lo mismo
Los cuadrados deben almacenar su lado y el punto de la esquina inferior izquierda.
Los círculos deben almacenar su radio y su centro. 

Implementar para todas las figuras el método getArea()

B.- También es necesario implementar la clase Segmento. Cada segmento está determinado por sus dos puntos extremos. 
Las figuras, los puntos y los segmentos se deben poder desplazar tanto en el eje x como en el eje y.

Es posible comparar una figura con otra teniendo en cuenta su área, y un segmento con otro tomando en cuenta su longitud.

Se pide además que, dado un segmento, se pueda saber si es paralelo al eje x, si es paralelo al eje y,  y si dos segmentos son paralelos entre sí. En el caso de los triángulos, se debe poder responder si alguno de sus lados es paralelo a alguno de los ejes.

Hacer diagrama UML con todas las clases interfaces y relaciones que describen su modelo de objetos.
