package io.prophecy.pipelines.automationpbtscalatrue01.graph

import io.prophecy.libs._
import io.prophecy.pipelines.automationpbtscalatrue01.functions.PipelineInitCode._
import io.prophecy.pipelines.automationpbtscalatrue01.functions.UDFs._
import io.prophecy.pipelines.automationpbtscalatrue01.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object select_from_temp_view {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    in0.createOrReplaceTempView("in0")
    context.spark.sql("select * from in0")
  }

}
