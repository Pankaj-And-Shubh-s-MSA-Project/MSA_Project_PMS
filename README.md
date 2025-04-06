
# 🏥 Project Management System (Microservices Architecture)

A robust and scalable **Project Management System (PMS)** built with a **Microservices Architecture** using **Spring Boot**. This system simulates a healthcare workflow with separate services for handling patients, doctors, appointments, billing, and more.

---

## 📐 Architecture Overview

This system is composed of independently deployable microservices, each responsible for a specific business capability. The services interact via REST and are orchestrated through a centralized **API Gateway** and a **Discovery Server** (Eureka).

---

## 🧩 Microservices Breakdown

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

- Java 17+
- Spring Boot
- Spring Cloud (Eureka, Gateway)
- Maven
- Swagger (OpenAPI)
- Docker (optional for containerization)
- IntelliJ IDEA (for development)

---

## 🚀 Getting Started

### ✅ Prerequisites

- Java 17
- Maven 3.6+
- Docker (optional for running with containers)

### 📦 Clone & Build

```bash
git clone https://github.com/your-username/MSA_Project_PMS.git
cd MSA_Project_PMS
mvn clean install
```

### ▶️ Running the System

> It's recommended to start the services in this order:

1. **Start Eureka Discovery Server**
   ```bash
   cd discovery-server
   mvn spring-boot:run
   ```

2. **Start API Gateway**
   ```bash
   cd api-gateway
   mvn spring-boot:run
   ```

3. **Start Other Microservices**
   - `doctor-service`
   - `patient-service`
   - `appointment-service`
   - `billing-service`
   - `swagger-aggregator`

Each service can be started individually:

```bash
cd <service-name>
mvn spring-boot:run
```

---

## 📚 API Documentation

Once running, visit:

- **Swagger UI (Aggregated)**: `http://localhost:<swagger-port>/swagger-ui.html`
- Or individual service docs (if hosted separately).

---

## 🧪 Sample Endpoints

```http
GET /api/patients/
GET /api/doctors/
POST /api/appointments/
GET /api/bills/{patientId}
```

These are proxied via the **API Gateway**.

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
