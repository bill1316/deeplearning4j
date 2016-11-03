
package org.deeplearning4j.ui.views.html.training

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object TrainingOverview_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class TrainingOverview extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[org.deeplearning4j.ui.api.I18N,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(i18n: org.deeplearning4j.ui.api.I18N):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>

        <meta charset="utf-8">
        <title>DL4J Training UI</title>
            <!-- Start Mobile Specific -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- End Mobile Specific -->

        <link id="bootstrap-style" href="/assets/css/bootstrap.min.css" rel="stylesheet">
        <link href="/assets/css/bootstrap-responsive.min.css" rel="stylesheet">
        <link id="base-style" href="/assets/css/style.css" rel="stylesheet">
        <link id="base-style-responsive" href="/assets/css/style-responsive.css" rel="stylesheet">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
        <link rel="shortcut icon" href="/assets/img/favicon.ico">

            <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
            <!--[if lt IE 9]>
	  	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<link id="ie-style" href="/assets/css/ie.css" rel="stylesheet"/>
	<![endif]-->

            <!--[if IE 9]>
		<link id="ie9style" href="/assets/css/ie9.css" rel="stylesheet"/>
	<![endif]-->

    </head>

    <body>
            <!-- Start Header -->
        <div class="navbar">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </a>
                    <a class="brand" href="#"><span>DL4J Training UI</span></a>
                </div>
            </div>
        </div>
            <!-- End Header -->

        <div class="container-fluid-full">
            <div class="row-fluid">

                    <!-- Start Main Menu -->
                <div id="sidebar-left" class="span2">
                    <div class="nav-collapse sidebar-nav">
                        <ul class="nav nav-tabs nav-stacked main-menu">
                            <li class="active"><a href="javascript:void(0);"><i class="icon-bar-chart"></i><span class="hidden-tablet">Overview</span></a></li>
                            <li><a href="model"><i class="icon-tasks"></i><span class="hidden-tablet">Model</span></a></li>
                            <li><a href="system"><i class="icon-dashboard"></i><span class="hidden-tablet">System</span></a></li>
                            <li><a href="help"><i class="icon-star"></i><span class="hidden-tablet">User Guide</span></a></li>
                            <li>
                                <a class="dropmenu" href="javascript:void(0);"><i class="icon-folder-close-alt"></i><span class="hidden-tablet"> Language</span></a>
                                <ul>
                                    <li><a class="submenu" href="javascript:void(0);"><i class="icon-file-alt"></i><span class="hidden-tablet"> English</span></a></li>
                                    <li><a class="submenu" href="javascript:void(0);"><i class="icon-file-alt"></i><span class="hidden-tablet"> 日本語</span></a></li>
                                    <li><a class="submenu" href="javascript:void(0);"><i class="icon-file-alt"></i><span class="hidden-tablet"> 中文</span></a></li>
                                    <li><a class="submenu" href="javascript:void(0);"><i class="icon-file-alt"></i><span class="hidden-tablet"> 한글</span></a></li>
                                    <li><a class="submenu" href="javascript:void(0);"><i class="icon-file-alt"></i><span class="hidden-tablet"> русский</span></a></li>
                                    <li><a class="submenu" href="javascript:void(0);"><i class="icon-file-alt"></i><span class="hidden-tablet"> український</span></a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
                    <!-- End Main Menu -->

                <noscript>
                    <div class="alert alert-block span10">
                        <h4 class="alert-heading">Warning!</h4>
                        <p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">
                            JavaScript</a> enabled to use this site.</p>
                    </div>
                </noscript>

                <!-- Start Score Chart-->
                <div id="content" class="span10">

                    <div class="row-fluid">

                        <div class="box span8">
                            <div class="box-header">
                                <h2><b>"""),_display_(/*89.41*/i18n/*89.45*/.getMessage("train.overview.chart.scoreTitle")),format.raw/*89.91*/("""</b></h2>
                            </div>
                            <div class="box-content">
                                <div id="scoreiterchart" class="center" style="height: 300px;" ></div>
                                <p id="hoverdata"><b>Score:</b> <span id="y">0</span>, <b>Iteration:</b> <span id="x">
                                    0</span></p>
                            </div>
                        </div>
                        <!-- End Score Chart-->
                        <!-- Start Model Table-->
                        <div class="box span4">
                            <div class="box-header">
                                <h2><b>"""),_display_(/*101.41*/i18n/*101.45*/.getMessage("train.overview.perftable.title")),format.raw/*101.90*/("""</b></h2>
                            </div>
                            <div class="box-content">
                                <table class="table table-bordered table-striped table-condensed">
                                    <tr>
                                        <td>Model Type</td>
                                        <td id="modelType">Loading...</td>
                                    </tr>
                                    <tr>
                                        <td>nLayers</td>
                                        <td id="nLayers">Loading...</td>
                                    </tr>
                                    <tr>
                                        <td>nParams</td>
                                        <td id="nParams">Loading...</td>
                                    </tr>
                                    <tr>
                                        <td>Start Time</td>
                                        <td id="startTime">Loading...</td>
                                    </tr>
                                    <tr>
                                        <td>Total Run Time</td>
                                        <td id="totalRuntime">Loading...</td>
                                    </tr>
                                    <tr>
                                        <td>Last Update</td>
                                        <td id="lastUpdate">Loading...</td>
                                    </tr>
                                    <tr>
                                        <td>Total Param Updates</td>
                                        <td id="totalParamUpdates">Loading...</td>
                                    </tr>
                                    <tr>
                                        <td>Updates Per Second</td>
                                        <td id="updatesPerSec">Loading...</td>
                                    </tr>
                                    <tr>
                                        <td>Examples Per Second</td>
                                        <td id="examplesPerSec">Loading...</td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <!--End Model Table -->
                    </div>


                    <div class="row-fluid">
                        <!--Start Ratio Table -->
                        <div class="box span6">
                            <div class="box-header">
                                <h2><b>"""),_display_(/*152.41*/i18n/*152.45*/.getMessage("train.overview.chart.updateRatioTitle")),format.raw/*152.97*/(""": log<sub>10</sub></b></h2>
                            </div>
                            <div class="box-content">
                                <div id="updateRatioChart"  class="center" style="height:300px;" ></div>
                                <p id="hoverdata"><b>Ratio:</b> <span id="yRatio">0</span>, <b>log<sub>10</sub> Ratio:</b> <span id="yLogRatio">0</span>, <b>Iteration:</b> <span id="xRatio">0</span></p>
                            </div>
                        </div>
                        <!--End Ratio Table -->
                        <!--Start Variance Table -->
                        <div class="box span6">
                            <div class="box-header">
                                <h2><b><h2><b>"""),_display_(/*163.48*/i18n/*163.52*/.getMessage("train.overview.chart.stdevTitle")),format.raw/*163.98*/(""": log<sub>10</sub></b></h2></b></h2>
                                <div style="float: right">
                                    <p class="stackControls center">
                                        <input class="btn btn-small" type="button" value="Activations" onclick="selectStdevChart('stdevActivations')">
                                        <input class="btn btn-small" type="button" value="Gradients" onclick="selectStdevChart('stdevGradients')">
                                        <input class="btn btn-small" type="button" value="Updates" onclick="selectStdevChart('stdevUpdates')">
                                    </p>
                                </div>
                            </div>
                            <div class="box-content">
                                <div id="stdevChart"  class="center" style="height:300px;" ></div>
                                <p id="hoverdata"><b>Standard Deviations:</b> <span id="yStdev">0</span>, <b>log<sub>10</sub> St. Dev:</b> <span id="yLogStdev">0</span>, <b>Iteration:</b> <span id="xStdev">0</span></p>
                            </div>
                        </div>
                        <!-- End Variance Table -->
                    </div>

                </div><!-- End Content Span10-->
            </div><!--End Row Fluid-->

            <!-- Start JavaScript-->
            <script src="/assets/js/jquery-1.9.1.min.js"></script>
            <script src="/assets/js/jquery-migrate-1.0.0.min.js"></script>
            <script src="/assets/js/jquery-ui-1.10.0.custom.min.js"></script>
            <script src="/assets/js/jquery.ui.touch-punch.js"></script>
            <script src="/assets/js/modernizr.js"></script>
            <script src="/assets/js/bootstrap.min.js"></script>
            <script src="/assets/js/jquery.cookie.js"></script>
            <script src="/assets/js/fullcalendar.min.js"></script>
            <script src="/assets/js/jquery.dataTables.min.js"></script>
            <script src="/assets/js/excanvas.js"></script>
            <script src="/assets/js/jquery.flot.js"></script>
            <script src="/assets/js/jquery.flot.pie.js"></script>
            <script src="/assets/js/jquery.flot.stack.js"></script>
            <script src="/assets/js/jquery.flot.resize.min.js"></script>
            <script src="/assets/js/jquery.chosen.min.js"></script>
            <script src="/assets/js/jquery.uniform.min.js"></script>
            <script src="/assets/js/jquery.cleditor.min.js"></script>
            <script src="/assets/js/jquery.noty.js"></script>
            <script src="/assets/js/jquery.elfinder.min.js"></script>
            <script src="/assets/js/jquery.raty.min.js"></script>
            <script src="/assets/js/jquery.iphone.toggle.js"></script>
            <script src="/assets/js/jquery.uploadify-3.1.min.js"></script>
            <script src="/assets/js/jquery.gritter.min.js"></script>
            <script src="/assets/js/jquery.imagesloaded.js"></script>
            <script src="/assets/js/jquery.masonry.min.js"></script>
            <script src="/assets/js/jquery.knob.modified.js"></script>
            <script src="/assets/js/jquery.sparkline.min.js"></script>
            <script src="/assets/js/counter.js"></script>
            <script src="/assets/js/retina.js"></script>
            <script src="/assets/js/train/overview.js"></script>    <!-- Charts and tables are generated here! -->

            <!-- Execute once on page load -->
            <script>
                    $(document).ready(function()"""),format.raw/*217.49*/("""{"""),format.raw/*217.50*/("""
                        """),format.raw/*218.25*/("""renderOverviewPage();
                    """),format.raw/*219.21*/("""}"""),format.raw/*219.22*/(""");
            </script>

            <!-- Execute periodically (every 2 sec) -->
            <script>
                    setInterval(function()"""),format.raw/*224.43*/("""{"""),format.raw/*224.44*/("""
                        """),format.raw/*225.25*/("""renderOverviewPage();
                    """),format.raw/*226.21*/("""}"""),format.raw/*226.22*/(""", 2000);
            </script>
            <!-- End JavaScript-->

    </body>
</html>
"""))
      }
    }
  }

  def render(i18n:org.deeplearning4j.ui.api.I18N): play.twirl.api.HtmlFormat.Appendable = apply(i18n)

  def f:((org.deeplearning4j.ui.api.I18N) => play.twirl.api.HtmlFormat.Appendable) = (i18n) => apply(i18n)

  def ref: this.type = this

}


}

/**/
object TrainingOverview extends TrainingOverview_Scope0.TrainingOverview
              /*
                  -- GENERATED --
                  DATE: Thu Nov 03 17:08:07 AEDT 2016
                  SOURCE: C:/DL4J/Git/deeplearning4j/deeplearning4j-ui-parent/deeplearning4j-play/src/main/views/org/deeplearning4j/ui/views/training/TrainingOverview.scala.html
                  HASH: 67d96eca18aad3e774ce74cf494bdb2cbaadee64
                  MATRIX: 604->1|737->39|765->41|5767->5016|5780->5020|5847->5066|6562->5753|6576->5757|6643->5802|9343->8474|9357->8478|9431->8530|10210->9281|10224->9285|10292->9331|13935->12945|13965->12946|14020->12972|14092->13015|14122->13016|14301->13166|14331->13167|14386->13193|14458->13236|14488->13237
                  LINES: 20->1|25->1|26->2|113->89|113->89|113->89|125->101|125->101|125->101|176->152|176->152|176->152|187->163|187->163|187->163|241->217|241->217|242->218|243->219|243->219|248->224|248->224|249->225|250->226|250->226
                  -- GENERATED --
              */
          