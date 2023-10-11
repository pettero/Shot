package com.karumi.shot.templates

object JUnitTemplate {

  def report(
              title: String,
              summaryResult: String,
              summaryTableBody: String
            ): String = {
    // language=XML
    s"""
<?xml version="1.0">
<testsuites name"${title}">

</testsuites>
"""
  }
}
