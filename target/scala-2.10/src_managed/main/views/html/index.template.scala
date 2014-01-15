
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Group],Form[Group],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(groups: List[Group], groupForm: Form[Group]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.47*/(""" 

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Groups")/*5.16*/ {_display_(Seq[Any](format.raw/*5.18*/("""
  
  <h1>"""),_display_(Seq[Any](/*7.8*/groups/*7.14*/.size())),format.raw/*7.21*/(""" task(s)</h1>
  
  <ul>
    """),_display_(Seq[Any](/*10.6*/for(group <- groups) yield /*10.26*/ {_display_(Seq[Any](format.raw/*10.28*/("""
      <li>"""),_display_(Seq[Any](/*11.12*/group/*11.17*/.groupName)),format.raw/*11.27*/(""" / """),_display_(Seq[Any](/*11.31*/group/*11.36*/.date)),format.raw/*11.41*/("""
      """),_display_(Seq[Any](/*12.8*/form(routes.Application.deleteGroup(group.id.toString()))/*12.65*/ {_display_(Seq[Any](format.raw/*12.67*/(""" 
         <input type="submit" value="Delete"> 
      """)))})),format.raw/*14.8*/("""
      </li>
    """)))})),format.raw/*16.6*/("""
  </ul>
  
  <h2>Add a new task</h2>
  
  <p>
        <a class="btn" href="">View sample</a>
    </p>
  
  """),_display_(Seq[Any](/*25.4*/form(routes.Application.newGroup())/*25.39*/ {_display_(Seq[Any](format.raw/*25.41*/("""
     """),_display_(Seq[Any](/*26.7*/inputText(groupForm("groupName")))),format.raw/*26.40*/(""" """),_display_(Seq[Any](/*26.42*/inputDate(groupForm("date")))),format.raw/*26.70*/("""
     <input type="submit" value="Create">
  
  """)))})),format.raw/*29.4*/(""" 

""")))})),format.raw/*31.2*/("""
"""))}
    }
    
    def render(groups:List[Group],groupForm:Form[Group]): play.api.templates.HtmlFormat.Appendable = apply(groups,groupForm)
    
    def f:((List[Group],Form[Group]) => play.api.templates.HtmlFormat.Appendable) = (groups,groupForm) => apply(groups,groupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 14 22:00:56 EST 2014
                    SOURCE: /Users/nirujan/Documents/Design Project/uwcentral/app/views/index.scala.html
                    HASH: c7fefca9169c0450bf18d78502e1ae7a7de674e8
                    MATRIX: 791->1|946->46|975->66|1011->68|1033->82|1072->84|1117->95|1131->101|1159->108|1223->137|1259->157|1299->159|1347->171|1361->176|1393->186|1433->190|1447->195|1474->200|1517->208|1583->265|1623->267|1710->323|1759->341|1903->450|1947->485|1987->487|2029->494|2084->527|2122->529|2172->557|2252->606|2287->610
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|38->10|38->10|38->10|39->11|39->11|39->11|39->11|39->11|39->11|40->12|40->12|40->12|42->14|44->16|53->25|53->25|53->25|54->26|54->26|54->26|54->26|57->29|59->31
                    -- GENERATED --
                */
            