// Databricks notebook source
// MAGIC %py
// MAGIC dbutils.notebook.run("NotebookParam", 60, {"foo": "MyNextValue"})

// COMMAND ----------

dbutils.notebook.run("./NotebookParam", 30, Map("foo" -> "myNextScalaValue"))

// COMMAND ----------

// MAGIC %run ./NotebookParam $foo="MyValueAlan"