<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>ForoHub API</h1>
    <p>ForoHub API es una aplicación que proporciona funcionalidades para la gestión de tópicos en un foro en línea. Permite a los usuarios crear, leer, actualizar y eliminar tópicos, así como también proporciona funciones adicionales como la búsqueda y paginación.</p>
    <h2>Tecnologías Utilizadas</h2>
    <ul>
        <li>Java 11</li>
        <li>Spring Boot</li>
        <li>Spring Data JPA</li>
        <li>Spring Web</li>
        <li>Lombok</li>
        <li>Jakarta Persistence API</li>
        <li>H2 Database (para desarrollo)</li>
    </ul>
    <h2>Configuración</h2>
    <ol>
        <li>Clona el repositorio de GitHub:</li>
    </ol>
    <pre><code>git clone https://github.com/tu-usuario/forohub-api.git</code></pre>
    <ol start="2">
        <li>Importa el proyecto en tu IDE preferido (Eclipse, IntelliJ, etc.).</li>
        <li>Asegúrate de tener Java 11 y Maven instalados en tu sistema.</li>
        <li>Configura las credenciales de la base de datos en el archivo <code>application.properties</code>:</li>
    </ol>
    <pre><code>spring.datasource.url=jdbc:mysql://localhost:3306/forohub
spring.datasource.username=usuario
spring.datasource.password=contraseña</code></pre>
    <h2>Ejecución</h2>
    <ol>
        <li>Desde tu IDE, ejecuta la clase principal <code>ForoHubApplication</code>.</li>
        <li>La aplicación se iniciará en el puerto 8080 por defecto.</li>
    </ol>
    <h2>Uso</h2>
    <p>La API ofrece los siguientes endpoints:</p>
    <ul>
        <li><code>POST /topics</code>: Crea un nuevo tópico.</li>
        <li><code>GET /topics</code>: Obtiene todos los tópicos.</li>
        <li><code>GET /topics/top10</code>: Obtiene los 10 tópicos más recientes.</li>
        <li><code>GET /topics/search?courseName={nombre}&amp;year={año}</code>: Busca tópicos por nombre de curso y año.</li>
        <li><code>GET /topics/paginated</code>: Obtiene tópicos paginados.</li>
        <li><code>GET /topics/{id}</code>: Obtiene los detalles de un tópico por su ID.</li>
        <li><code>PUT /topics/{id}</code>: Actualiza los datos de un tópico existente por su ID.</li>
        <li><code>DELETE /topics/{id}</code>: Elimina un tópico por su ID.</li>
    </ul>
    <h2>Contribuciones</h2>
    <p>Las contribuciones son bienvenidas. Si deseas contribuir a este proyecto, por favor sigue estos pasos:</p>
    <ol>
        <li>Crea un fork del repositorio.</li>
        <li>Crea una nueva rama para tu función (<code>git checkout -b feature/nueva-funcion</code>).</li>
        <li>Realiza tus cambios y commitea (<code>git commit -am 'Agrega nueva función'</code>).</li>
        <li>Sube tus cambios a tu fork (<code>git push origin feature/nueva-funcion</code>).</li>
        <li>Crea un pull request en el repositorio original.</li>
    </ol>
    <h2>Licencia</h2>
    <p>Este proyecto está licenciado bajo la <a href="https://opensource.org/licenses/MIT">Licencia MIT</a>.</p>
</body>
</html>
