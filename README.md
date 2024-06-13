<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>ForoHub API</h1>
    <p>ForoHub API es una aplicación que permite la gestión de tópicos en un foro en línea. Los usuarios pueden crear, leer, actualizar y eliminar tópicos, así como realizar búsquedas y paginación de los mismos.</p>
    <h2>Tecnologías Utilizadas</h2>
    <ul>
        <li>Java 11</li>
        <li>Spring Boot</li>
        <li>Spring Data JPA</li>
        <li>Spring Web</li>
        <li>Lombok</li>
        <li>Jakarta Persistence API</li>
        <li>MySQL</li>
        <li>Spring Security</li>
        <li>JWT (JSON Web Tokens)</li>
    </ul>
    <h2>Configuración</h2>
    <ol>
        <li>Clona el repositorio de GitHub:</li>
    </ol>
    <pre><code>git clone https://github.com/tu-usuario/forohub-api.git</code></pre>
    <ol start="2">
        <li>Importa el proyecto en tu IDE preferido (NetBeans, IntelliJ, etc.).</li>
        <li>Asegúrate de tener Java 17 y Maven instalados en tu sistema.</li>
        <li>Configura las credenciales de la base de datos en el archivo <code>application.properties</code>:</li>
    </ol>
    <h2>Ejecución</h2>
    <ol>
        <li>Desde tu IDE, ejecuta la clase principal <code>ForoHubApplication</code>.</li>
        <li>La aplicación se iniciará en el puerto 8080 por defecto.</li>
    </ol>
    <h2>Seguridad</h2>
    <p>La aplicación utiliza <strong>Spring Security</strong> para la autenticación y autorización, y <strong>JWT</strong> para la gestión de sesiones.</p>
    <h3>Proceso de Autenticación y Autorización</h3>
    <ul>
        <li><strong>Generación de Tokens JWT:</strong> Se genera un token JWT al autenticar a un usuario.</li>
        <li><strong>Validación de Tokens JWT:</strong> Los tokens JWT se validan para proteger los endpoints de la API.</li>
    </ul>
    <h3>Puntos Clave de la Configuración</h3>
    <ul>
        <li><strong>Autenticación:</strong> Se maneja a través de un controlador de autenticación que verifica las credenciales del usuario y genera un token JWT.</li>
        <li><strong>Filtros de Seguridad:</strong> Se configuran filtros para interceptar solicitudes HTTP y validar los tokens JWT.</li>
    </ul>
    <h2>Rutas de la API</h2>
    <ul>
        <li><strong>Autenticación:</strong>
            <ul>
                <li><code>POST /login</code>: Autentica a un usuario y devuelve un token JWT.</li>
            </ul>
        </li>
        <li><strong>Gestión de Tópicos:</strong>
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
        </li>
    </ul>
    <h3>Ejemplo de Uso de Autenticación</h3>
    <p>Para autenticar a un usuario y obtener un token JWT, se debe realizar una solicitud POST a <code>/login</code> con las credenciales del usuario. Para acceder a un endpoint protegido, se debe incluir el token JWT en el encabezado de la solicitud.</p>
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
