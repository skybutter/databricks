// Databricks notebook source
//dbutils.widgets.text("foo", "fooDefault", "fooEmptyLabel")

// COMMAND ----------

// MAGIC %py
// MAGIC print("the input parameter: foo=" + dbutils.widgets.get("foo"))