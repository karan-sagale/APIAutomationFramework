# 🚀 API Automation Framework – Rest Assured + Java

A scalable **REST API Automation Framework** built using **Java, Rest Assured, TestNG, and Log4j2**.

This framework demonstrates **industry-level API automation practices** including:

✔ Service layer design

✔ Request/Response POJO models

✔ Custom logging filters

✔ TestNG listeners

✔ CI integration with GitHub Actions

---

# 🛠 Tech Stack

* ☕ **Java 11**
* 🔗 **Rest Assured**
* 🧪 **TestNG**
* 📦 **Maven**
* 📝 **Log4j2**
* ⚙️ **GitHub Actions (CI)**
* 🔄 **Jackson (JSON serialization)**

---

# ✨ Framework Features

✔ REST API automation using **Rest Assured**

✔ **Service Layer Architecture** for reusable API calls

✔ **Request & Response POJO Models**

✔ Custom **RestAssured Logging Filters**

✔ **TestNG Listeners** for test lifecycle logging

✔ Centralized logging using **Log4j2**

✔ CI pipeline using **GitHub Actions**

✔ Execution using **TestNG suite.xml**

---

# 📂 Project Structure

```id="5b0fkn"
APIAutomationFramework
│
├── src/test/java
│
├── com.api.base
│   ├── AuthService.java
│   ├── BaseService.java
│   └── UserProfileManagementService.java
│
├── com.api.filters
│   └── LoggingFilter.java
│
├── com.api.listeners
│   └── TestListener.java
│
├── com.api.models.request
│   ├── LoginRequest.java
│   ├── SignupRequest.java
│   └── ProfileRequest.java
│
├── com.api.models.response
│   ├── LoginResponse.java
│   └── UserProfileResponse.java
│
├── com.api.tests
│   ├── AccountCreationTest.java
│   ├── ForgotPasswordTest.java
│   ├── GetProfileRequestTest.java
│   ├── LoginAPITest.java
│   ├── LoginAPITest2.java
│   ├── LoginAPITest3.java
│   └── UpdateProfileTest.java
```

---

# 🧱 Framework Architecture

The framework follows a **layered structure**:

```
Test Layer
     ↓
Service Layer
     ↓
Request / Response Models
     ↓
RestAssured Client
     ↓
API Server
```

This structure helps with:

* ✔ Code reusability
* ✔ Maintainability
* ✔ Scalability

---

# 🔎 Framework Components

## 🧩 Base Service

Provides common configurations:

* Base URI
* Request specifications
* Shared API setup

Example:

```id="q17rbq"
BaseService.java
```

---

## 🔐 API Services

Handles API operations.

Examples:

```id="8ep4f4"
AuthService.java
UserProfileManagementService.java
```

Responsible for:

* Login
* Signup
* Profile APIs

---

## 📦 Request Models

POJO classes used to construct API payloads.

Examples:

```id="v4fsy0"
LoginRequest.java
SignupRequest.java
ProfileRequest.java
```

---

## 📬 Response Models

Used to deserialize API responses.

Examples:

```id="t8nsnb"
LoginResponse.java
UserProfileResponse.java
```

---

## 🧾 Logging Filter

Custom **Rest Assured Filter** used to log:

* Request body
* Request headers
* Response body
* Response status

Example:

```id="tn8itn"
LoggingFilter.java
```

---

## 🎧 TestNG Listener

Captures test lifecycle events:

* Test start
* Test success
* Test failure
* Test skipped

Example:

```id="5r7hmm"
TestListener.java
```

---

# 📝 Logging

Logging is implemented using **Log4j2**.

📄 Configuration file:

```
src/test/resources/log4j2.xml
```

📂 Logs generated at:

```
logs/test.log
```

---

# ▶️ Running Tests

Execute tests using Maven:

```id="q02j05"
mvn clean test -Dsuite=suite
```

Test execution is controlled through:

```
suite.xml
```

---

# ⚙️ Continuous Integration (CI)

This project includes **GitHub Actions CI pipeline**.

📄 Workflow file:

```
.github/workflows/maven.yml
```

Pipeline performs:

* ✔ Checkout repository
* ✔ Setup Java environment
* ✔ Install Maven dependencies
* ✔ Execute API tests
* ✔ Upload logs
* ✔ Publish test reports

### CI Triggers

Tests run automatically on:

* Push to **main**
* Pull requests
* Scheduled executions

---

# 📊 Logs & Reports

📄 Logs:

```
logs/test.log
```

📊 TestNG reports:

```
target/surefire-reports
```

Reports are also available in **GitHub Actions workflow runs**.

---

# ⚠️ Known Issues

* Currently **Login API tests execute successfully**.
* Some other API endpoints return **HTTP 500 (Internal Server Error)**.

Based on request logs and manual verification, this appears to be an issue with the **backend API environment rather than the automation framework**.

The test cases for these APIs are already implemented and **may start working once the backend issues are fixed by the API owner**.

---

# 👨‍💻 Author

**Karan Sagale**

Senior Software Testing Engineer

Automation Testing | API Testing | Selenium | Rest Assured | TestNG

---

⭐ If you find this project useful, consider **starring the repository**.
