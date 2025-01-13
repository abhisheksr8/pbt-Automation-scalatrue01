package io.prophecy.pipelines.automationpbtnoscalatrue01.config

import org.apache.spark.sql.SparkSession
case class Context(spark: SparkSession, config: Config)
