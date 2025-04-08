
# Patient Management System (Microservices Architecture)

A robust and scalable **Project Management System (PMS)** built with a **Microservices Architecture** using **Spring Boot**. This system simulates a healthcare workflow with separate services for handling patients, doctors, appointments, billing, and more.

---

## Architecture Overview

This system is composed of independently deployable microservices, each responsible for a specific business capability. The services interact via REST and are orchestrated through a centralized **API Gateway** and a **Discovery Server** (Eureka).

---

## Microservices Breakdown

| Service               | Description                                                                 |
|-----------------------|-----------------------------------------------------------------------------|
| `api-gateway`         | Routes client requests to appropriate services and handles load balancing. |
| `discovery-server`    | Service registry (Eureka) for dynamic service discovery.                    |
| `patient-service`     | Handles CRUD operations for patient records and health data.               |
| `doctor-service`      | Manages doctors’ profiles, availability, and specialties.                  |
| `appointment-service` | Allows patients to book, view, and cancel appointments.                    |
| `billing-service`     | Manages payment processing and billing history.                            |
| `swagger-aggregator`  | Aggregates API documentation from all services for easier exploration.     |

---

## 🛠️ Technologies Used

- Java 24
- Spring Boot
- Spring Cloud (Eureka, Gateway)
- Maven
- Swagger (OpenAPI)
- Docker 
- IntelliJ IDEA 

---


## 📦 Folder Structure

```
MSA_Project_PMS/
├── api-gateway/
├── appointment-service/
├── billing-service/
├── discovery-server/
├── doctor-service/
├── patient-service/
├── swagger-aggregator/
└── ...
```

---

## 🤝 Contributing

Pull requests are welcome! Please open issues to suggest features or report bugs.

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

## 👤 Authors

Developed by Shubh Joshi and Pankaj Mirchandani
