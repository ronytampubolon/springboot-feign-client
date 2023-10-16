<h1>Example Feign Client Usage in SpringBoot</h1>
<p>Getting started</p>
<ul>
<li>Clone Project</li>
<li>Gradle Sync</li>
<li>Run Address Service First</li>
<li>Run Customer Service</li></li>
</ul>
<p>Expected when hit this endpoint using curl or postman:</p>
<p>Url : 127.0.0.1:9191/api/customer/10051</p>
```JSON
    {
    "id": 10051,
    "name": "Jhon DOe",
    "email": "jhondoe@gmail.com",
    "address": {
        "address": "Jl. Gatot Subroto",
        "city": "Jakarta",
        "postalCode": "12770"
    }
}
```