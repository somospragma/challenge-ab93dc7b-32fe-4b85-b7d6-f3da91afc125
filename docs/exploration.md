# Documento de Exploración

## Componentes principales del sistema actual 

El sistema actual se describe como un microservicio SpringBoot Java
que usa Webflux. Usa JPA, H2 y Security. El modulo principal obedece a las transacciones Bancarias. 

## Restricciones y Ambigüedades

### Restricción técnica: 

* El sistema de banca en línea de Pragma necesita una nueva arquitectura
    -Se parte del supuesto que se necesita evolucionar el sistema existente, apoyado en lo ya existente del proyecto. Se debe validar con stakeholders dado que no se especifica.

### Ambigüedad: 

* No está claro cómo se manejarán los errores de transacción.

* El sistema debe soportar altas transacciones diarias:
    Se observa que no hay informacion suficiente por parte del cliente para conocer la demada de transacciones, tampoco se conoce la carga real que aguanta el sistema para establecer el rendimiento, la demanda por del cliente parte de una base asumible que puede cambiar en base a necesidad del negocio, con picos a la alta o a la baja que impactan  si el diseño se hace autoescalable o no, lo resolveremos  con sesiones adhoc con el cliente que nos permita conocer la demada real del negocio y en paralelo implementaremos pruebas de carga al sistema actual que nos permita evaluar la infraestrucura y sus cuellos de botella para un correcto escalamiento y adaptacion a una necesidad estipulada por el negocio.
    
* JPA y Webflux en el proyecto.

### Hallazgos

* Se observa un codigo fuente a medio implementar, lo que implica partir de muchos supuestos que son necesarios obtener de conversaciones con el cliente. 

* Se observan implementaciones de JPA y Webflux en el proyecto lo que sugiere implementaciones bloqueantes y no bloqueantes segun la causa, debido a que webflux trabaja con pocos hilos y jpa deja hilos parados, el renidimiento de la aplicacion se ve afectada ante la necesidad de el aumento de transacciones diarias. 