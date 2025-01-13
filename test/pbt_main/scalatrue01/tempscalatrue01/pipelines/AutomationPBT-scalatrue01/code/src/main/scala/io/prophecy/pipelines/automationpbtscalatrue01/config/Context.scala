package io.prophecy.pipelines.automationpbtscalatrue01.config

import org.apache.spark.sql.SparkSession
case class Context(spark: SparkSession, config: Config)
