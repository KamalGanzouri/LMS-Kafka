# LMS-Kafka

LMS-Kafka is an Instructor-Student application that utilizes Kafka and Spring Boot to manage and process educational data efficiently.

## Overview

This project is designed to facilitate communication and data exchange between instructors and students using Kafka for messaging and Spring Boot for backend services. The application is divided into two main components:

- **Instructor Service**: Manages instructor-related operations.
- **Student Service**: Manages student-related operations.

## Key Features

- Real-time messaging between instructors and students using Kafka.
- RESTful APIs for managing instructor and student data.
- Integration with MySQL for data persistence.
- Spring Boot-based microservices architecture.


### Prerequisites

- Java 17
- Maven
- MySQL



### Instructor Service

- **API Endpoint**: `/api/instructors`
- **Description**: Manage instructor-related operations such as creating, updating, and retrieving instructor data.

### Student Service

- **API Endpoint**: `/api/students`
- **Description**: Manage student-related operations such as creating, updating, and retrieving student data.

### Kafka Messaging

- Kafka is used for real-time messaging between the Instructor and Student services.

## Dependencies

- Spring Boot 3.0.5
- Spring Data JPA
- Spring Web
- Spring Kafka 3.0.6
- MySQL Connector
