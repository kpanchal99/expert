==

Ad Rotater====================================================================================
<marquee>
    <div>
           <asp:AdRotator ID="AdRotator1" runat="server" DataSourceID="XmlDataSource1" />
            <asp:XmlDataSource ID="XmlDataSource1" runat="server" DataFile="~/AddvertiseData.xml"></asp:XmlDataSource>
    </div>
</marquee>  
<?xml version="1.0" encoding="utf-8" ?>
<Advertisements>
	<Ad>
		<ImageUrl>./Imgs/discord.png</ImageUrl>
		<NavigateUrl>http://www.discord.com</NavigateUrl>
		<AlternateText>
			Discord
		</AlternateText>
		<Impressions>20</Impressions>
		<Keyword>Discord</Keyword>
	</Ad>
	<Ad>
		<ImageUrl>./Imgs/1.png</ImageUrl>
		<NavigateUrl>http://www.primevideo.com</NavigateUrl>
		<AlternateText>
			Prime Video
		</AlternateText>
		<Impressions>30</Impressions>
		<Keyword>Discord</Keyword>
	</Ad>
	<Ad>
		<ImageUrl>./Imgs/netflix.png</ImageUrl>
		<NavigateUrl>http://www.netflix.com</NavigateUrl>
		<AlternateText>
			Netflix
		</AlternateText>
		<Impressions>30</Impressions>
		<Keyword>Netflix</Keyword>
	</Ad>
</Advertisements>

=====Upload File===============================================================================
    <asp:FileUpload ID="FileUpload1" runat="server" />
    <asp:Label ID="Label1" runat="server" Text="Label"></asp:Label>
    <br />
    <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Button" />
    <br />
	
        protected void Button1_Click(object sender, EventArgs e)
        {
            // upload 
            if (FileUpload1.HasFile)
            {
                // Save the file to the server
                string fileName = Path.GetFileName(FileUpload1.FileName);
                FileUpload1.SaveAs(Server.MapPath("~/Imgs/") + fileName);
                Label1.Text = "File uploaded successfully!";
            }
            else
            {
                Label1.Text = "Please select a file to upload.";
            }
        }
		
===========Calendar===================================================================
    <asp:Calendar ID="Calendar1" Caption="MCA" runat="server" OnDayRender="Calendar1_DayRender" OnSelectionChanged="Calendar1_SelectionChanged"></asp:Calendar>


    <asp:Label ID="Label1" runat="server" Text="Label"></asp:Label>
    <br />
    <asp:Label ID="Label2" runat="server" Text="Label"></asp:Label>
    <br />
    <asp:Label ID="Label3" runat="server" Text="Label"></asp:Label>
    <br />
    <asp:Button ID="Button1" runat="server" OnClick="Button1_Click1" Text="Button" />
    <br />
	
       protected void Button1_Click1(object sender, EventArgs e)
       {
           Label1.Text = Calendar1.TodaysDate.ToString();
           Label2.Text = Calendar1.Caption.ToString();

           if (Calendar1.SelectedDate.ToShortDateString() == "17-03-2024")
           {
               Label3.Text = "<b>Friday hai bc!!!<b>";
           }
           else
           {
               Label3.Text = "";
           }
       }

       protected void Calendar1_SelectionChanged(object sender, EventArgs e)
       {
           Label1.Text = "Your Selected Date" + Calendar1.SelectedDate.ToString();
           Label2.Text = Calendar1.Caption.ToString();
       }

       protected void Calendar1_DayRender(object sender, DayRenderEventArgs e)
       {
           if (e.Day.Date.Day == 5 && e.Day.Date.Month == 9)
           {
               e.Cell.BackColor = System.Drawing.Color.AliceBlue;
               Label lbl = new Label();
               lbl.Text = "<br> Teachers Dat";
               e.Cell.Controls.Add(lbl);
               Image img = new Image();
               img.ImageUrl = "./intro-1598364383.jpg";
               img.Height = 50;
               img.Width = 100;
               e.Cell.Controls.Add((Image)img);
           }


           if (e.Day.Date.Day == 25 && e.Day.Date.Month == 12)
           {
               e.Cell.BackColor = System.Drawing.Color.AliceBlue;
               Label lbl = new Label();
               lbl.Text = "<br> Chrismas";
               e.Cell.Controls.Add(lbl);
               Image img = new Image();
               img.ImageUrl = "./intro-1598364383.jpg";
               img.Height = 500;
               img.Width = 1000;
               e.Cell.Controls.Add((Image)img);
           }


           if (e.Day.Date.Day == 7 && e.Day.Date.Month == 9)
           {
               DateTime dt = new DateTime(2024, 9, 7);
               Label lbl = new Label();
               lbl.Text = "<br>Ganpati Vacations";
               Calendar1.SelectedDates.SelectRange(dt, dt.AddDays(10));
               e.Cell.Controls.Add(lbl);
           }
       }
	   
==============POST BACK and Cross Page=====================================================

if (!IsPostBack && Request.QueryString["name"] != null)
{
	Label1.Text = HttpUtility.UrlDecode(Request.QueryString["name"]);
}



===============Validation ===============================================================================



=============Data Bound Controls=================================================================================
        <div>
            <asp:Label ID="Label1" runat="server" Text="Select a City: "></asp:Label>
            <asp:DropDownList ID="DropDownList1" runat="server" AutoPostBack="True" OnSelectedIndexChanged="DropDownList1_SelectedIndexChanged"></asp:DropDownList>
            <br />
            <asp:Label ID="Label2" runat="server" Text="You selected: "></asp:Label>
            <asp:Label ID="SelectedCityLabel" runat="server"></asp:Label>
        </div>
		
		   protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                BindCitiesToDropDownList();
            }
        }

        private void BindCitiesToDropDownList()
        {
            List<string> cities = new List<string>
            {
                "New York",
                "Los Angeles",
                "Chicago",
                "Houston",
            };

            DropDownList1.DataSource = cities;
            DropDownList1.DataBind();
        }

        protected void DropDownList1_SelectedIndexChanged(object sender, EventArgs e)
        {
            SelectedCityLabel.Text = DropDownList1.SelectedValue;
        }
		
===========================================================================
     <asp:GridView ID="GridView1" runat="server">
    </asp:GridView>


    <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
    <br />
    <br />
    <asp:TextBox ID="TextBox2" runat="server" ></asp:TextBox>
    <br />
    <br />
    <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
    <br />
    <br />
    <asp:Button ID="Button1" runat="server" Text="Insert" OnClick="InsertButton_Click" />
    <asp:Button ID="Button2" runat="server" Text="Update" OnClick="UpdateButton_Click"/>
    <asp:Button ID="Button3" runat="server" Text="Delete" OnClick="DeleteButton_Click"/>
 
 
 String conn = "Data Source=(LocalDB)\\MSSQLLocalDB;AttachDbFilename=C:\\Users\\kpanchal\\source\\repos\\ADODemo\\ADODemo\\App_Data\\mca_practice.mdf;Integrated Security=True";
 protected void Page_Load(object sender, EventArgs e)
 {
     if (!IsPostBack)
     {
         BindGridView();

     }
  
 }
 private void BindGridView()
 {
     string query = "SELECT * FROM Student";

     using (SqlConnection connection = new SqlConnection(conn))
     {
         SqlCommand command = new SqlCommand(query, connection);
         connection.Open();
         SqlDataReader reader = command.ExecuteReader();
         GridView1.DataSource = reader;
         GridView1.DataBind();
         connection.Close();
     }
 }

 protected void InsertButton_Click(object sender, EventArgs e)
 {
     string name = TextBox2.Text;
     string email = TextBox3.Text;

     int id = Convert.ToInt32(TextBox1.Text);
     string query = "INSERT INTO Student (id,name,email) VALUES (@id,@name,@email)";

     using (SqlConnection connection = new SqlConnection(conn))
     {
         SqlCommand command = new SqlCommand(query, connection);
         command.Parameters.AddWithValue("@id", id);
         command.Parameters.AddWithValue("@name", name);
         command.Parameters.AddWithValue("@email", email);
         connection.Open();
         command.ExecuteNonQuery();
         connection.Close();
         BindGridView();
     }
 }

 protected void UpdateButton_Click(object sender, EventArgs e)
 {
     string name = TextBox2.Text;
     string email = TextBox3.Text;

     int id = Convert.ToInt32(TextBox1.Text);

     string query = "UPDATE student SET name = @name , email = @email WHERE id = @id";

     using (SqlConnection connection = new SqlConnection(conn))
     {
         SqlCommand command = new SqlCommand(query, connection);
         command.Parameters.AddWithValue("@id", id);
         command.Parameters.AddWithValue("@name", name);
         command.Parameters.AddWithValue("@email", email);
         connection.Open();
         command.ExecuteNonQuery();
         connection.Close();
         BindGridView();

     }
 }

 protected void DeleteButton_Click(object sender, EventArgs e)
 {


     int id = Convert.ToInt32(TextBox1.Text);

     string query = "DELETE FROM Student WHERE id = @id";

     using (SqlConnection connection = new SqlConnection(conn))
     {
         SqlCommand command = new SqlCommand(query, connection);
         command.Parameters.AddWithValue("@id", id);
         connection.Open();
         command.ExecuteNonQuery();
         connection.Close();
         BindGridView();
     }

 }
 }
 }

===========================================================================
// take gridview in aspx
public partial class WebForm2 : System.Web.UI.Page
{
	DataSet ds = new DataSet();
	protected void Page_Load(object sender, EventArgs e)
	{
		ds.ReadXml(Server.MapPath("~/XMLFile1.xml"));
		GridView1.DataSource = ds;
		GridView1.DataBind();

	}
}


======================================================================
            <asp:ScriptManager ID="ScriptManager1" runat="server"></asp:ScriptManager>
            
            <asp:Timer ID="Timer1" runat="server" Interval="6000" OnTick="Tick"></asp:Timer>
            <asp:Timer ID="Timer2" runat="server" Interval="1000" OnTick="Timer2_Tick"></asp:Timer>

            <asp:UpdatePanel ID="UpdatePanel1" runat="server">
                <ContentTemplate>

                    <asp:Label ID="Label2" runat="server" Text="Quotes"/></h1>
                    <br />
                    <br />
                    <asp:Label ID="Label3" runat="server" Text=""/></h1>
           
                </ContentTemplate>
                <Triggers>
                      <asp:AsyncPostBackTrigger ControlID="Timer2" EventName="Tick" />
                      <asp:AsyncPostBackTrigger ControlID="Timer1" EventName="Tick" />
                </Triggers>
            </asp:UpdatePanel>
			
			
    public partial class Timer : System.Web.UI.Page
    {
        List<String> quotes = new List<String>();
        Random random;

        protected void Page_Load(object sender, EventArgs e)
        {
            random = new Random();
            quotes.Add("W");
            quotes.Add("F");
            quotes.Add("LOL");
            quotes.Add("KYS");

            Label2.Text = quotes[random.Next(0, quotes.Count)];
        }

        protected void Tick(object sender, EventArgs e)
        {

            Label2.Text = $"Quote : {quotes[random.Next(0, quotes.Count)]}";

        }

        protected void Timer2_Tick(object sender, EventArgs e)
        {
            Label3.Text = DateTime.Now.ToString();
        }
    }

=========View State and Session State======================================================
protected void Page_Load(object sender, EventArgs e)
        {
            lblwelcome.Text = "Welcome:" + Session["un"].ToString();
            lblmsg.Text = "Welcome to  MCA " + Session["pl"].ToString() + "!!";

        }

//set and redirect
        protected void btnsub_Click(object sender, EventArgs e)
        {
             ViewState["name"] = txtname.Text;
            ViewState["add"] = txtadd.Text;
            ViewState["edu"] = txtedu.Text;

            txtname.Text = txtadd.Text = txtedu.Text = String.Empty;

            //create a session
            Session["un"] = txtname.Text;
            Session["pl"] = txtprog.Text;

            //redirect to page 2
            Response.Redirect("~/WebForm2.aspx");
        }
		
==============Cookie===============================================================
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
       <div>
            <asp:Label ID="Label1" runat="server" Font-Bold="True" Font-Size="XX-Large" Text="Select a book:"></asp:Label>
            <br />
            <br />
            <asp:RadioButtonList ID="rblbooks" runat="server">
            </asp:RadioButtonList>
            <br />
            <br />
            <asp:Button ID="btnadd" runat="server" Font-Bold="True" Font-Size="Large" OnClick="btnadd_Click" Text="Add Book" />
            <asp:Button ID="btnview" runat="server" Font-Bold="True" Font-Size="Medium"  PostBackUrl="~/book_details.aspx" Text="View Details" />
            <br />
            <br />
            <br />
            <asp:Label ID="lblmsg" runat="server" Font-Bold="True" ForeColor="#6666FF" Text="Label"></asp:Label>
        </div>


</asp:Content>
    public partial class CookieExample : System.Web.UI.Page
    {
        Dictionary<string, string> books_dt;

        protected void Page_Init(object sender, EventArgs e)
        {
            books_dt = new Dictionary<string, string>();
            books_dt.Add("C++", "Bjarne stroupstrup");
            books_dt.Add("Java", "Ivor Horton");
            books_dt.Add("C", "Dennis Ritchie");
            books_dt.Add("Machine Learning", "Tom micthell");
            books_dt.Add("Python", "Allen Downey");

            rblbooks.Items.Clear();

            foreach (String s in books_dt.Keys)
            {
                rblbooks.Items.Add(s);
            }
        }
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnadd_Click(object sender, EventArgs e)
        {
            if (rblbooks.SelectedIndex > 0)
            {
                //get the selected index
                String bn = rblbooks.SelectedValue;
                String bdes = books_dt[bn];

                //create  a coookies
                HttpCookie cl = new HttpCookie(bn, bdes);

                //add cookie
                Response.Cookies.Add(cl);

            }

            else
            {
                lblmsg.Text = "Please Select a book";

            }
        }
        
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">

   <div>
            <asp:Label ID="Label1" runat="server" Font-Bold="True" ForeColor="#000000" Text="Hey,You have Selected"></asp:Label>
        </div>
        <asp:ListBox ID="lstdetails" runat="server" BackColor="#F6F6F6" Font-Bold="True" Font-Size="XX-Large" ></asp:ListBox>
        <p>
            <asp:LinkButton ID="LinkButton1" runat="server" Font-Bold="True" Font-Italic="True" PostBackUrl="~/books.aspx">Select Another book</asp:LinkButton>
        </p>

</asp:Content>



    public partial class book_details : System.Web.UI.Page
    {
        HttpCookieCollection cookies;

        protected void Page_Load(object sender, EventArgs e)
        {
            //Fecth all cookies
            cookies = Request.Cookies;

            //display cookies in a listbox
            if (cookies.Count > 0)
            {
                for (int i = 0; i < cookies.Count; i++)
                {
                    lstdetails.Items.Add("Book:" + cookies[i].Name + "Author:" + cookies[i].Value);

                }

            }
            else
            {
                lstdetails.Items.Add("No books selected");
            }
        }
    }
    }
=============================================================================
D] Using Page Caching
Source Code:
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Practical_10
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            Label1.Text = DateTime.Now.ToLongTimeString();

        }


    }
}

ASPX
<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="Practical_10.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
        <form id="form1" runat="server">
        <div>
            <h3>Time in cache page</h3>
            <asp:Label ID="Label1" runat="server" Font-Bold="True" Font-Size="Large" Text="Time in cache page:"></asp:Label>
        </div>
        <p>
            &nbsp;</p>
    </form>
</body>
</html>

Output:

====================================================================================

using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ADODemo
{
    public partial class ConsumeService : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void btnadd_Click(object sender, EventArgs e)
        {
            WebService1 client = new WebService1();

            int res = client.Add(Convert.ToInt32(txtfn.Text), (Convert.ToInt32(txtsn.Text)));
            lblres.Text = res.ToString();
        }

        protected void btnsub_Click(object sender, EventArgs e)
        {
            WebService1 client = new WebService1();
            int res = client.Subtract(Convert.ToInt32(txtfn.Text), Convert.ToInt32(txtsn.Text));
            lblres.Text = res.ToString();
        }

        protected void btnmul_Click(object sender, EventArgs e)
        {
            WebService1 client = new WebService1();
            int res = client.Multiply(Convert.ToInt32(txtfn.Text), Convert.ToInt32(txtsn.Text));
            lblres.Text = res.ToString();
        }

        protected void btndiv_Click(object sender, EventArgs e)
        {
            WebService1 client = new WebService1();
            int res = client.Divide(Convert.ToInt32(txtfn.Text), Convert.ToInt32(txtsn.Text));
            lblres.Text = res.ToString();
        }
        
        ==========================================
        
        <%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="ConsumeService.aspx.cs" Inherits="ADODemo.ConsumeService" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">

      <div>
        </div>
        <asp:Label ID="Label1" runat="server" Text="First Number"></asp:Label>
        <asp:TextBox ID="txtfn" runat="server"></asp:TextBox>
        <p>
            <asp:Label ID="Label2" runat="server" Text="Second Number"></asp:Label>
            <asp:TextBox ID="txtsn" runat="server" ></asp:TextBox>
        </p>
        <p>
            <asp:Label ID="Label3" runat="server" Text="Result"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:Label ID="lblres" runat="server" Text="[lblres]"></asp:Label>
        </p>
        <asp:Button ID="btnadd" runat="server" OnClick="btnadd_Click" Text="Add" />
&nbsp;
        <asp:Button ID="btnsub" runat="server" OnClick="btnsub_Click" Text="Sub" />
&nbsp;
        <asp:Button ID="btnmul" runat="server" OnClick="btnmul_Click" Text="Mul" />
&nbsp;
        <asp:Button ID="btndiv" runat="server" OnClick="btndiv_Click" Text="Div" />

</asp:Content>


    }
}




=====================================
  [WebMethod]
  public string HelloWorld()
  {
      return "Hello, World!";
  }
  [WebMethod]
  public int Add(int fn, int sn)
  {
      return fn + sn;
  }
  [WebMethod]
  public int Subtract(int fn, int sn)
  {
      return fn - sn;
  }
  [WebMethod]
  public int Multiply(int fn, int sn)
  {
      return fn * sn;
  }
  [WebMethod]
  public int Divide(int fn, int sn)
  {
      return fn / sn;
  }
===========WCF =============================================================================
//create new project - wcf service library
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WcfDemoService
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IService1" in both code and config file together.
    [ServiceContract]
    public interface IService1
    {
        [OperationContract]
        string GetData(int value);

        [OperationContract]
        string Addtion(int value1, int value2);
        [OperationContract]
        string CalculateDays(int day, int month, int year);
        [OperationContract]
        CompositeType GetDataUsingDataContract(CompositeType composite);

        // TODO: Add your service operations here
    }

    // Use a data contract as illustrated in the sample below to add composite types to service operations.
    // You can add XSD files into the project. After building the project, you can directly use the data types defined there, with the namespace "WcfDemoService.ContractType".
    [DataContract]
    public class CompositeType
    {
        bool boolValue = true;
        string stringValue = "Hello ";

        [DataMember]
        public bool BoolValue
        {
            get { return boolValue; }
            set { boolValue = value; }
        }

        [DataMember]
        public string StringValue
        {
            get { return stringValue; }
            set { stringValue = value; }
        }
    }
}

serrvice file
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WcfDemoService
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in both code and config file together.
    public class Service1 : IService1
    {
        public string GetData(int value)
        {
            return string.Format("You entered: {0}", value);
        }
        public string Addtion(int value1, int value2)
        {
            return string.Format("Addition is {0}", (value1 + value2));
        }
        public string CalculateDays(int day, int month, int year)
        {
            DateTime date = new DateTime(year, month, day);
            int diffdate = DateTime.Now.Subtract(date).Days;
            diffdate = Math.Abs(diffdate);

            return string.Format("Date is {0} Differnce is {1}", date.ToShortDateString(), diffdate);
        }

        public CompositeType GetDataUsingDataContract(CompositeType composite)
        {
            if (composite == null)
            {
                throw new ArgumentNullException("composite");
            }
            if (composite.BoolValue)
            {
                composite.StringValue += "Suffix";
            }
            return composite;
        }
    }
}
============User Control================================================================
User Control
WebForm1.aspx
<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication4.WebForm1" %>
<%@ Register Src="~/WebUserControl1.ascx" TagName="WebUserControl1" TagPrefix="ctrl" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head >
    <title>User Control Example</title>
</head>
<body>
        <div>
            <ctrl:WebUserControl1 ID="WebUserControl1" runat="server" />
        </div>
</body>
</html>


webusercontrol1.aspx
<%@ Control Language="C#" AutoEventWireup="true" CodeBehind="WebUserControl1.ascx.cs" Inherits="WebApplication4.WebUserControl1" %>
<form runat="server">
    <asp:Label ID="Label1" runat="server" Text="Name"></asp:Label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <asp:TextBox ID="TextBox1" runat="server" Height="34px" Width="143px"></asp:TextBox>
    <br />
    <br />
    <asp:Label ID="Label2" runat="server" Text="City"></asp:Label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <asp:TextBox ID="TextBox2" runat="server" Height="37px" Width="144px"></asp:TextBox>
    <br />
    <br />
    <asp:Button ID="Button1" runat="server" Text="Submit" Height="51px" Width="90px" OnClick="Button1_Click" />
    <br />
    <br />
    <asp:Label ID="Label7" runat="server" Text="Label"></asp:Label>
</form>


webusercontrol1.aspx.cs
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication4
{
    public partial class WebUserControl1 : System.Web.UI.UserControl
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void Button1_Click(object sender, EventArgs e)
        {
            Label7.Text = TextBox1.Text;
        }

    }
}

========Web Service with Database=======================================================

webservice asmx

using System;
using System.Data;
using System.Data.SqlClient;
using System.Web.Services;

namespace ProductService
{
    /// <summary>
    /// Summary description for WebService1
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    public class WebService1 : System.Web.Services.WebService
    {
        string connString = "Data Source=(LocalDB)\\MSSQLLocalDB;AttachDbFilename=C:\\Path\\To\\Your\\Database\\ProductDB.mdf;Integrated Security=True";

        [WebMethod]
        public DataSet Get_Products()
        {
            using (SqlConnection conn = new SqlConnection("Data Source=(LocalDB)\\MSSQLLocalDB;AttachDbFilename=C:\\Path\\To\\Your\\Database\\ProductDB.mdf;Integrated Security=True"))
            {
                conn.Open();
                SqlCommand cmd = new SqlCommand("SELECT * FROM Product", conn);
                SqlDataAdapter adpt = new SqlDataAdapter(cmd);
                DataSet ds = new DataSet();
                adpt.Fill(ds);
                return ds;
            }
        }

        [WebMethod]
        public DataSet Get_ProductByName(string productName)
        {
            using (SqlConnection conn = new SqlConnection(connString))
            {
                conn.Open();
                SqlCommand cmd = new SqlCommand("SELECT * FROM Product WHERE ProductName LIKE '%' + @ProductName + '%'", conn);
                cmd.Parameters.AddWithValue("@ProductName", productName);
                SqlDataAdapter adpt = new SqlDataAdapter(cmd);
                DataSet ds = new DataSet();
                adpt.Fill(ds);
                return ds;
            }
        }
    }
}

webform behind

using System;
using System.Data;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ProductService
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        ServiceReference1.WebService1SoapClient serviceSoapClient; // Adjust namespace as per your Service Reference
        
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                serviceSoapClient = new ServiceReference1.WebService1SoapClient(); // Initialize the service client
                BindProducts();
            }
        }

        protected void btnShowProducts_Click(object sender, EventArgs e)
        {

            //serviceSoapClient = new ServiceReference1.WebService1SoapClient(); // Initialize the service client
            //BindProductsByName(txtProductName.Text);
        }

        private void BindProducts()
        {
            DataSet data = serviceSoapClient.Get_Products(); // Call web service method to get all products
            GridView1.DataSource = data;
            GridView1.DataBind();
        }

        private void BindProductsByName(string productName)
        {
            DataSet data = serviceSoapClient.Get_ProductByName(productName); // Call web service method to get products by name
            GridView2.DataSource = data;
            GridView2.DataBind();
        }
    }
}



// webform

<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="ProductService.WebForm1" %>


<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Product Details</title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:GridView ID="GridView1" runat="server" BackColor="#99FF66">
            </asp:GridView>
            <br />
            <br />
        </div>
        <asp:TextBox ID="txtProductName" runat="server" style="width: 128px"></asp:TextBox>
        &nbsp;&nbsp;
        <asp:Button ID="btnShowProducts" runat="server" BackColor="#CC99FF" OnClick="btnShowProducts_Click" Text="Show Products" />
        <p>
            <asp:GridView ID="GridView2" runat="server" BackColor="#FFCC66">
            </asp:GridView>
        </p>
    </form>
</body>
</html>

// run asmx -> take copy url path for methods

// after right click add -> service reference -> add the path here click go
