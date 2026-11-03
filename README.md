Feira & Office 🛒🏢
A comprehensive management system for fairs and office operations, designed to streamline vendor management, inventory tracking, sales operations, and administrative tasks. This Java-based application provides robust tools for managing both fair events and office operations efficiently.

📖 Table of Contents
Overview

Features

Technologies

Installation

Usage

Project Structure

Class Diagram

Contributors

License

🎯 Overview
Feira & Office is a sophisticated management system developed to handle the unique challenges of managing fair events and office operations simultaneously. The system provides integrated solutions for vendor management, inventory control, sales tracking, customer relations, and administrative tasks in a single platform.

✨ Features
🎪 Fair Management
Vendor Registration - Complete vendor profiles with contact information and specialties

Stall Allocation - Intelligent stall assignment and layout management

Event Scheduling - Fair dates, times, and recurring event management

Attendance Tracking - Visitor and participant monitoring

Revenue Management - Stall fees, commissions, and financial tracking

🏢 Office Operations
Inventory Management - Stock tracking, reordering, and supplier management

Sales Processing - Point-of-sale system with receipt generation

Customer Database - Client information and purchase history

Financial Reporting - Income, expenses, and profit analysis

Document Management - Contracts, invoices, and administrative documents

📊 Vendor Features
Product Catalog - Vendor-specific product listings and pricing

Sales Analytics - Individual vendor performance metrics

Payment Processing - Commission calculations and payment tracking

Profile Management - Business information and operational details

🔍 Reporting & Analytics
Sales Reports - Daily, weekly, and monthly sales analysis

Inventory Reports - Stock levels, turnover rates, and valuation

Vendor Performance - Revenue, attendance, and customer satisfaction

Financial Summaries - Profit & loss statements and cash flow analysis

⚙️ Administrative Tools
User Management - Role-based access control (Admin, Manager, Vendor, Staff)

System Configuration - Customizable settings and business rules

Backup & Recovery - Data export/import and system backup

Audit Trail - Comprehensive activity logging and change tracking

🛠️ Technologies
Java 17+ - Core programming language with modern features

Object-Oriented Programming - Advanced OOP principles and design patterns

Java Collections Framework - Efficient data structures and algorithms

File I/O Operations - Robust file-based data persistence

Date & Time API - Comprehensive date handling for events and scheduling

Input Validation - Advanced validation with regular expressions

Exception Handling - Comprehensive error handling and recovery

Development Tools
Maven - Project management and build automation

JUnit - Unit testing framework

Git - Version control system

IDE Support - IntelliJ IDEA, Eclipse, VS Code

📥 Installation
Prerequisites
Java JDK 17 or higher

Maven 3.6+

Git

Installation Steps
Clone the Repository

bash
git clone https://github.com/BMSaiko/Feira-And-Office.git
cd Feira-And-Office
Build the Project

bash
# Using Maven
mvn clean compile

# Or compile directly
javac -d target/classes src/main/java/**/*.java
Run the Application

bash
# Using Maven
mvn exec:java -Dexec.mainClass="com.feiraoffice.Main"

# Or run directly
java -cp target/classes com.feiraoffice.Main
Configuration
Create a config.properties file in the project root:

properties
# Application Configuration
app.name=Feira & Office
app.version=1.0.0
data.directory=./data

# Database Configuration
data.file.vendors=vendors.dat
data.file.products=products.dat
data.file.sales=sales.dat
data.file.customers=customers.dat

# Business Rules
tax.rate=0.23
commission.rate=0.15
max.stalls=50
🚀 Usage
Main Menu System
text
=== FEIRA & OFFICE MANAGEMENT SYSTEM ===
1. Vendor Management
2. Inventory Management
3. Sales Operations
4. Fair Event Management
5. Customer Relations
6. Reporting & Analytics
7. System Administration
0. Exit System
Vendor Management
Register Vendor - Add new vendors with complete business details

Update Vendor Info - Modify vendor information and status

Stall Assignment - Assign and manage vendor stalls

Vendor Payments - Process commissions and fees

Inventory Management
Add Products - Register new products with specifications

Stock Updates - Manage inventory levels and reordering

Supplier Management - Maintain supplier information

Price Management - Update pricing and discounts

Sales Operations
Process Sales - Point-of-sale transactions

Return Processing - Handle product returns and refunds

Receipt Generation - Create and print sales receipts

Payment Tracking - Monitor payments and outstanding balances

Fair Event Management
Event Creation - Schedule new fair events

Stall Layout - Design and manage fair layout

Participant Management - Handle vendor participation

Attendance Tracking - Monitor visitor numbers

📁 Project Structure
text
Feira-And-Office/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── feiraoffice/
│                   ├── Main.java                    # Application entry point
│                   ├── model/                       # Data model classes
│                   │   ├── Vendor.java              # Vendor entity
│                   │   ├── Product.java             # Product entity
│                   │   ├── Sale.java                # Sales transaction
│                   │   ├── Customer.java            # Customer entity
│                   │   ├── FairEvent.java           # Event management
│                   │   ├── Stall.java               # Stall allocation
│                   │   └── enums/                   # Enumeration types
│                   │       ├── VendorType.java
│                   │       ├── ProductCategory.java
│                   │       ├── PaymentMethod.java
│                   │       └── UserRole.java
│                   ├── service/                     # Business logic layer
│                   │   ├── VendorService.java       # Vendor operations
│                   │   ├── InventoryService.java    # Inventory management
│                   │   ├── SalesService.java        # Sales processing
│                   │   ├── FairService.java         # Event management
│                   │   ├── ReportService.java       # Reporting functions
│                   │   └── FileDataService.java     # Data persistence
│                   ├── util/                        # Utility classes
│                   │   ├── DateUtils.java           # Date manipulations
│                   │   ├── InputValidator.java      # Input validation
│                   │   ├── PriceCalculator.java     # Pricing calculations
│                   │   ├── ReportGenerator.java     # Report creation
│                   │   └── ConfigManager.java       # Configuration management
│                   └── exception/                   # Custom exceptions
│                       ├── VendorNotFoundException.java
│                       ├── InsufficientStockException.java
│                       ├── DuplicateEntryException.java
│                       └── FileOperationException.java
├── data/                                           # Data storage directory
│   ├── vendors.dat                                # Vendor database
│   ├── products.dat                               # Product database
│   ├── sales.dat                                  # Sales records
│   ├── customers.dat                              # Customer database
│   └── events.dat                                 # Event records
├── config/                                        # Configuration files
│   └── application.properties                     # System configuration
├── reports/                                       # Generated reports
├── docs/                                          # Documentation
├── pom.xml                                        # Maven configuration
└── README.md                                      # Project documentation
📊 Class Diagram
text
Main
  ↓
Service Layer (VendorService, InventoryService, SalesService, FairService)
  ↓
Model Layer (Vendor, Product, Sale, Customer, FairEvent, Stall)
  ↓
FileDataService
  ↓
Data Storage (Files)
Key Class Relationships:
Vendor → Stall (One-to-Many)

Product → Vendor (Many-to-One)

Sale → Product, Customer (Composition)

FairEvent → Vendor, Stall (Association)

Services → Models (Business Logic)

👥 Contributors
Bruno Silva (@BMSaiko) - Lead Developer & System Architect

Development Team - Additional contributors and testers

Developed as part of the Software Engineering curriculum, focusing on real-world business management challenges and enterprise application development.

📄 License
This project is developed for academic and demonstration purposes. All rights reserved by the contributors.

🔧 Development
Building the Project
bash
# Clean and compile
mvn clean compile

# Run tests
mvn test

# Create JAR package
mvn package

# Generate documentation
mvn javadoc:javadoc
Code Style
Java Coding Conventions - Follows Oracle Java code conventions

Meaningful Naming - Descriptive class, method, and variable names

Documentation - Comprehensive JavaDoc comments

Error Handling - Proper exception handling and validation

Testing
bash
# Run unit tests
mvn test

# Generate test coverage report
mvn jacoco:report
🚀 Deployment
Production Build
bash
# Create executable JAR
mvn clean package

# Run application
java -jar target/feira-office-1.0.0.jar
System Requirements
Java Runtime: JDK 17 or higher

Memory: 512MB RAM minimum, 1GB recommended

Storage: 200MB available space

Operating System: Windows 10+, macOS 10.14+, Linux Ubuntu 18.04+

🤝 Contributing
Fork the repository

Create a feature branch (git checkout -b feature/amazing-feature)

Commit your changes (git commit -m 'Add amazing feature')

Push to the branch (git push origin feature/amazing-feature)

Open a Pull Request

🐛 Bug Reports
If you discover any bugs, please create an issue with:

Detailed description of the bug

Steps to reproduce

Expected behavior

Environment details

🔮 Future Enhancements
Web Interface - Web-based administration panel

Mobile Application - Vendor and staff mobile apps

Online Payments - Integration with payment gateways

Advanced Analytics - Business intelligence and predictive analytics

Multi-location Support - Multiple fair locations and offices

API Integration - Third-party system integrations

