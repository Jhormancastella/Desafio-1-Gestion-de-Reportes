# 🎯 Desafío 1: Gestión de Reportes 📊

## 📌 Descripción

Una empresa necesita generar reportes en diferentes formatos:

- **PDF**
- **Excel**
- **CSV**

Cada reporte debe permitir:

1. **Generar el reporte** (`generateReport()`)
2. **Descargar el reporte** (`downloadReport()`)

## 🛠️ Tareas

1. Implementa el patrón **Abstract Factory** para generar reportes en diferentes formatos.
2. Crea una fábrica concreta para cada tipo de reporte.
3. El código cliente debe solicitar un formato y recibir el reporte adecuado.

---

## 🚀 Estructura del Proyecto

### 📂 Clases Principales

1. **Interfaces:**
   - `ReportFactory`: Define los métodos para crear reportes.
   - `Report`: Define los métodos comunes para todos los reportes (`generateReport()`, `downloadReport()`).

2. **Fábricas Concretas:**
   - `PDFReportFactory`: Implementa `ReportFactory` para crear reportes en formato PDF.
   - `ExcelReportFactory`: Implementa `ReportFactory` para crear reportes en formato Excel.
   - `CSVReportFactory`: Implementa `ReportFactory` para crear reportes en formato CSV.

3. **Reportes Concretos:**
   - `PDFReport`: Implementa `Report` para generar y descargar reportes en PDF.
   - `ExcelReport`: Implementa `Report` para generar y descargar reportes en Excel.
   - `CSVReport`: Implementa `Report` para generar y descargar reportes en CSV.

4. **Cliente:**
   - `Client`: Solicita un tipo de reporte y utiliza la fábrica correspondiente para obtenerlo.

---

## 🚀 Instalación y Configuración

### 📋 Requisitos Previos

- **Java Development Kit (JDK) 17 o superior**
- **Git instalado en tu sistema**

### 📥 Clonar Repositorio

```bash
git clone https://github.com/tu-usuario/gestion-reportes.git
```

### 🛠️ Compilar y Ejecutar

1. Abre una terminal en la carpeta del proyecto.
2. Compila los archivos Java:

```bash
javac *.java
```

3. Ejecuta el programa:

```bash
java Client
```

---

## 🛠️ Uso

1. **Selección de Formato:**
   - El programa solicitará al usuario seleccionar un formato de reporte (PDF, Excel o CSV).

2. **Generación del Reporte:**
   - Una vez seleccionado el formato, se generará el reporte correspondiente.

3. **Descarga del Reporte:**
   - El usuario podrá descargar el reporte generado.

---

## 📋 Ejemplo de Ejecución

```plaintext
Seleccione el formato del reporte (PDF, Excel, CSV): PDF
Generando reporte en formato PDF...
Reporte PDF generado correctamente.
¿Desea descargar el reporte? (S/N): S
Descargando reporte PDF...
```

---

## 📋 Características

- **Generación de reportes en diferentes formatos** (PDF, Excel, CSV).
- **Uso del patrón Abstract Factory** para garantizar flexibilidad y escalabilidad.
- **Interfaz común** para todos los reportes, permitiendo operaciones como generar y descargar.

---

## 🚨 Estado del Ejercicio

- **Culminado.**

---

## 👤 Autor

- **Jhorman Jesús Castellanos Morales**
