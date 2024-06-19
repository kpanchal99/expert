
                                	         		      
Session 1 - Basic of Numpy 

Aim -
Description - 
Code & Output -
import numpy as np
np.__version__
# declare one varaible to strore ndarray
arr = np.array([1,2,3,4,5,6])
#type(arr)


# convert list to array
a = ["MCA",33,9.99]
ar = np.array(a)
print(type(a) , type(ar))


# convert to tuple
t = ("karan",24,99)
tar = np.array(t)
print(type(t) , type(tar))


# assignment


#create a var T1 and assign tuple to it
t1 = ("KJSIM","Somaiya","Management")
#create array from tuple
t1arr = np.array(t1)
#check the type
print(type(t1) , type(t1arr))


# Dimension in array
arr = np.array([[1,2,3],[4,5,6]])
print(type(arr))


# arr.shape = > (axis 0 )row , (axis 1 )column
arr.shape


arr = np.array([[[1,3,4],[4,5,6]] , [[2,3,4],[4,6,9]]])
print(arr)


# accessing array
arr = np.array((1,2,3,4,5))
print(arr[0], arr[2] )
print("Sum of two index is : ",arr[1] + arr[4] )


# access the elements -> row (dimensions) column(index)
arr = np.array([[1,2,3,4,5],[6,7,8,9,10]])
# access the first row and second column
print(arr[0,1])
# access the second row and fifth column
print(arr[1,4])


arr = np.array([[[1,3,4],[4,5,6]] , [[2,3,4],[4,6,9]]])
print(arr[0,1,2])


print("--------------")
# accessing the second element of the first array of the second array
print(arr[1,0,1])
# accessing the second element of the second array of the second array
print(arr[1,1,1])








 
Session 2 - Apriori Code

Aim -
Description - 
Code & Output -

# read from local drive
# from google.colab import files
# uploaded = files.upload()

# convert file to dataframe
# import io
df = pd.read_csv(io.BytesIO(uploaded['purchased_data.csv']))
# print(df)



# mounting from google drive
from google.colab import drive
drive.mount('/content/drive')

path  = "/content/drive/MyDrive/Sem 2/purchased_data.csv"
df = pd.read_csv(path)
print(df)

# url = "https://raw.githubusercontent.com/codeforamerica/ohana-api/master/data/sample-csv/contacts.csv"
# df = pd.read_csv(url)
# print(df)

ath  = "/content/purchased_data.csv"
df = pd.read_csv(path,header=None)
print(df)


records = []


for i in range(0, len(df)):
  temp = []
  for j in range(0, 4):
    if str(df.values[i,j]) != "nan":
      temp.append(str(df.values[i,j]))


  records.append(temp)


print(records)

Output : 
[['Shoes', 'Skirt', 'T-Skirt'], ['Jeans', 'T-Skirt'], ['Jeans', 'Shorts'], ['Jeans', 'Shoes', 'Skirt', 'T-Skirt'], ['Shorts', 'Shoes', 'Skirt']]



!pip install apyori
from apyori import apriori

# generate rules


assocation_rules = apriori(records,min_support = 0.5, min_confidence = 0.75)
assocation_results = list(assocation_rules)
print(assocation_results)

Output : 
[RelationRecord(items=frozenset({'Bread'}), support=0.8, ordered_statistics=[OrderedStatistic(items_base=frozenset(), items_add=frozenset({'Bread'}), confidence=0.8, lift=1.0)]), RelationRecord(items=frozenset({'Juice'}), support=0.8, ordered_statistics=[OrderedStatistic(items_base=frozenset(), items_add=frozenset({'Juice'}), confidence=0.8, lift=1.0)]), RelationRecord(items=frozenset({'nan'}), support=0.8, ordered_statistics=[OrderedStatistic(items_base=frozenset(), items_add=frozenset({'nan'}), confidence=0.8, lift=1.0)]), RelationRecord(items=frozenset({'Chees', 'Juice'}), support=0.6, ordered_statistics=[OrderedStatistic(items_base=frozenset({'Chees'}), items_add=frozenset({'Juice'}), confidence=1.0, lift=1.25)]), RelationRecord(items=frozenset({'Milk', 'nan'}), support=0.6, ordered_statistics=[OrderedStatistic(items_base=frozenset({'Milk'}), items_add=frozenset({'nan'}), confidence=1.0, lift=1.25)])]




path  = "/content/fashion_data.csv"
df = pd.read_csv(path,header=None)
print(df)


records2 = []


for i in range(0, len(df)):
  temp = []
  for j in range(0, 4):
    if str(df.values[i,j]) != "nan":
      temp.append(str(df.values[i,j]))


  records2.append(temp)
print(records2)




assocation_rules = apriori(records,min_support = 0.4, min_confidence = 0.6)
assocation_results = list(assocation_rules)
print(assocation_results)

Output : 
[RelationRecord(items=frozenset({'Jeans'}), support=0.6, ordered_statistics=[OrderedStatistic(items_base=frozenset(), items_add=frozenset({'Jeans'}), confidence=0.6, lift=1.0)]), RelationRecord(items=frozenset({'Shoes'}), support=0.6, ordered_statistics=[OrderedStatistic(items_base=frozenset(), items_add=frozenset({'Shoes'}), confidence=0.6, lift=1.0)]), RelationRecord(items=frozenset({'Skirt'}), support=0.6, ordered_statistics=[OrderedStatistic(items_base=frozenset(), items_add=frozenset({'Skirt'}), confidence=0.6, lift=1.0)]), RelationRecord(items=frozenset({'T-Skirt'}), support=0.6, ordered_statistics=[OrderedStatistic(items_base=frozenset(), items_add=frozenset({'T-Skirt'}), confidence=0.6, lift=1.0)]), RelationRecord(items=frozenset({'T-Skirt', 'Jeans'}), support=0.4, ordered_statistics=[OrderedStatistic(items_base=frozenset({'Jeans'}), items_add=frozenset({'T-Skirt'}), confidence=0.6666666666666667, lift=1.1111111111111114), OrderedStatistic(items_base=frozenset({'T-Skirt'}), items_add=frozenset({'Jeans'}), confidence=0.6666666666666667, lift=1.1111111111111114)]), RelationRecord(items=frozenset({'Skirt', 'Shoes'}), support=0.6, ordered_statistics=[OrderedStatistic(items_base=frozenset(), items_add=frozenset({'Skirt', 'Shoes'}), confidence=0.6, lift=1.0), OrderedStatistic(items_base=frozenset({'Shoes'}), items_add=frozenset({'Skirt'}), confidence=1.0, lift=1.6666666666666667), OrderedStatistic(items_base=frozenset({'Skirt'}), items_add=frozenset({'Shoes'}), confidence=1.0, lift=1.6666666666666667)]), RelationRecord(items=frozenset({'Shoes', 'T-Skirt'}), support=0.4, ordered_statistics=[OrderedStatistic(items_base=frozenset({'Shoes'}), items_add=frozenset({'T-Skirt'}), confidence=0.6666666666666667, lift=1.1111111111111114), OrderedStatistic(items_base=frozenset({'T-Skirt'}), items_add=frozenset({'Shoes'}), confidence=0.6666666666666667, lift=1.1111111111111114)]), RelationRecord(items=frozenset({'Skirt', 'T-Skirt'}), support=0.4, ordered_statistics=[OrderedStatistic(items_base=frozenset({'Skirt'}), items_add=frozenset({'T-Skirt'}), confidence=0.6666666666666667, lift=1.1111111111111114), OrderedStatistic(items_base=frozenset({'T-Skirt'}), items_add=frozenset({'Skirt'}), confidence=0.6666666666666667, lift=1.1111111111111114)]), RelationRecord(items=frozenset({'Skirt', 'Shoes', 'T-Skirt'}), support=0.4, ordered_statistics=[OrderedStatistic(items_base=frozenset({'Shoes'}), items_add=frozenset({'Skirt', 'T-Skirt'}), confidence=0.6666666666666667, lift=1.6666666666666667), OrderedStatistic(items_base=frozenset({'Skirt'}), items_add=frozenset({'Shoes', 'T-Skirt'}), confidence=0.6666666666666667, lift=1.6666666666666667), OrderedStatistic(items_base=frozenset({'T-Skirt'}), items_add=frozenset({'Skirt', 'Shoes'}), confidence=0.6666666666666667, lift=1.1111111111111114), OrderedStatistic(items_base=frozenset({'Skirt', 'Shoes'}), items_add=frozenset({'T-Skirt'}), confidence=0.6666666666666667, lift=1.1111111111111114), OrderedStatistic(items_base=frozenset({'Shoes', 'T-Skirt'}), items_add=frozenset({'Skirt'}), confidence=1.0, lift=1.6666666666666667), OrderedStatistic(items_base=frozenset({'Skirt', 'T-Skirt'}), items_add=frozenset({'Shoes'}), confidence=1.0, lift=1.6666666666666667)])]


Session 3 - Introduction with Pandas 

Aim -
Description - 
Code & Output -
import pandas as pd
import numpy as np


#
series = pd.Series(5, index =[0,1,2,3])
print(series)


# pass np array to Series(data)
data = np.array([33,44,55,67,77])
result = pd.Series(data)
print(result)



# assignment
values = np.array([33,44,55,66])
series = pd.Series (values, index = ['a','b','c','d'])
print(series)

* Data - values to be passed in dataframe. * Index - Used to label index for rows * Columns - Used to label index for columns * Dtype - Used to define data type for columns List, Dict, Tuple, String, Series, Another Dataframe, Numpy array  

#create series using dictionary
dict1 = {'a':111, 'b':121 , 'c' : 131}
s3 = pd.Series(dict1)
print(s3)



# assignment
dict2 = {'p':101, 'q':102 , 'r' : 103, 's' : 104}
s4 = pd.Series(dict2)
print(s4)


apple = [10,20,30,40]
banana = [11,22,33,44]
df1 = pd.DataFrame([apple,banana])
df1


df1 = pd.DataFrame([apple,banana],index = ['apple','banana'], columns= ['jan','feb','mar','apr'])
df1



apple = [10,20,30,40]
banana = [11,22,33,44]
orange = [55,66,77,88,99]
rw = ['apple','banana','orange']
cl = ['jan','feb','mar','apr','may']
df1 = pd.DataFrame([apple,banana,orange] , index = rw , columns = cl)
df1
# NaN is automatically inserted in columns


# 4 creating DataFrame using Series
#DataFrame is the 2D representation of series object
s1 = pd.Series([10,20,30], index = [1,2,3])
df2 = pd.DataFrame(s1)
df2




# 5 creating using Multiple Series
s2 = pd.Series([100,200,300], index = [1,2,3])
df2 = pd.DataFrame([s1,s2])
df2

s1 = pd.Series([10,20,30], index = ['jan','feb','mar'])
df2 = pd.DataFrame(s1)
df2
s2 = pd.Series([100,200,300], index = ['jan','feb','mar'])
df2 = pd.DataFrame([s1,s2], index = ['sale1', 'sale2'])
df2


# 7 create df passing dic using key value pair
s3 = pd.Series(['kabaddi','kho-kho','volly ball'])
s4 = pd.Series([7,12,5])
dict = {'sports':s3, 'No of Players':s4}
df = pd.DataFrame(dict)
df


# add index in df


df = pd.DataFrame(dict, index = ['s1','s2','s3'])
df


# 6. Create dataframe using dictionary of dictionary (nested dictionary )
dict2 = { "Manager" :  { "IT Support" : "Pranjal", "Operations" : "Karan"},
         "Engineer" :  { "IT Support" : "PS", "Operations" : "KP"}}
df6 = pd.DataFrame(dict2)
df6

# Assignment create dataframe using numpy array
            Manager    Engineer
IT Sup        
OPs         
Sys Infra         
Info Secu   

# creating the Numpy array
array = np.array([['Karan', "Vijay"], ['Pranjal', "Falguni"],
                  ['Darshan', "Prachi"], ['Nilesh', "Pratik"] ])


# creating a list of index names
index_values = ['IT Support', 'Operations', 'System Infrastructure', 'Info Security']


# creating a list of column names
column_values = ['Manager', 'Engineer']


# creating the dataframe
df = pd.DataFrame(data = array,
                  index = index_values,
                  columns = column_values)
df






# 7. Export DataFrame into CSV (Excel Sheet)
df.to_csv("Sample.csv")
# Export DataFrame into CSV (Excel Sheet) without Index
df.to_csv("Sample_WithoutIndex.csv", index = False)

# Assignment
dict5 = { "sports" :  { "0" : "kabaddi", "1" : "Kho-Kho", "2" : "VollyBall"},
         "No Of Players" :  { "0" : "7", "1" : "12", "2" : "5"}}
df7 = pd.DataFrame(dict5)
df7



# Export DataFrame into CSV (Excel Sheet)
df7.to_csv("Player.csv")
# Export DataFrame into CSV (Excel Sheet) without Index
df7.to_csv("Player_WithoutIndex.csv", index = False)

# If DataFrame is large
# tail()
# returns a specified numbers of last rows.
df.tail(2)


# head()
# returns a  specified numbers of rows, from the top.
df.head(1)



Session 4 - Data Preprocessing
Data preprocessing is an important step in the data mining process. It refers to the cleaning, transforming, and integrating of data in order to make it ready for analysis. The goal of data preprocessing is to improve the quality of the data and to make it more suitable for the specific data mining task.
Some common steps in data preprocessing include:
Data preprocessing is an important step in the data mining process that involves cleaning and transforming raw data to make it suitable for analysis. Some common steps in data preprocessing include:
Data Cleaning: This involves identifying and correcting errors or inconsistencies in the data, such as missing values, outliers, and duplicates. Various techniques can be used for data cleaning, such as imputation, removal, and transformation.
Data Integration: This involves combining data from multiple sources to create a unified dataset. Data integration can be challenging as it requires handling data with different formats, structures, and semantics. Techniques such as record linkage and data fusion can be used for data integration.
Data Transformation: This involves converting the data into a suitable format for analysis. Common techniques used in data transformation include normalization, standardization, and discretization. Normalization is used to scale the data to a common range, while standardization is used to transform the data to have zero mean and unit variance. Discretization is used to convert continuous data into discrete categories.
Data Reduction: This involves reducing the size of the dataset while preserving the important information. Data reduction can be achieved through techniques such as feature selection and feature extraction. Feature selection involves selecting a subset of relevant features from the dataset, while feature extraction involves transforming the data into a lower-dimensional space while preserving the important information.
Data Discretization: This involves dividing continuous data into discrete categories or intervals. Discretization is often used in data mining and machine learning algorithms that require categorical data. Discretization can be achieved through techniques such as equal width binning, equal frequency binning, and clustering.
Data Normalization: This involves scaling the data to a common range, such as between 0 and 1 or -1 and 1. Normalization is often used to handle data with different units and scales. Common normalization techniques include min-max normalization, z-score normalization, and decimal scaling.
Data preprocessing plays a crucial role in ensuring the quality of data and the accuracy of the analysis results. The specific steps involved in data preprocessing may vary depending on the nature of the data and the analysis goals.

Aim -
Description - 
Code & Output -
weather = pd.read_csv("weather_data.csv")
weather



# fillna (return DataFrame)
weather.fillna(0)




newdf = weather.fillna( {
    "temperature" : 0,
    "windspeed" : 0,
    "event" : "No event"
} )
newdf

newdf2 = weather.fillna(method = "ffill")
newdf2


newdf2 = weather.fillna(method = "bfill")
newdf2



newdf = weather.fillna( {
    "event" : "No event"
} )
newdf2 = newdf.interpolate()
newdf2

# remove all row containing NaN
newdf4 = weather.dropna()
newdf4


Session 5 - Seaborn
Aim -
Description - 
Code & Output -
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns # data visualize - lib for making statistical graphics in python. help us explore and understand our data
from sklearn.preprocessing import LabelEncoder

# Data Pre processing
# matplotlib operations


# reading from github
titanic_url = "https://raw.githubusercontent.com/datasciencedojo/datasets/master/titanic.csv"
titanic = pd.read_csv(titanic_url)

titanic.tail()



titanic.head()





titanic.isnull()


sns.heatmap(titanic.isnull())



Session 6 - Matplot Data Visualization 

Aim -
Description - 
Code & Output -
Q1. Create Customization of Histogram

data1 = pd.read_csv("/content/Assignment_Data1.csv")
data1

a. Plot a histogram for whole dataset

plt.hist(data1['15-16'], bins = 10, rwidth = 0.95)
plt.hist(data1['16-17'], bins = 10, rwidth = 0.95)
plt.hist(data1['17-18'], bins = 10, rwidth = 0.95)
plt.hist(data1['18-19'], bins = 10, rwidth = 0.95)
plt.hist(data1['20-21'], bins = 10, rwidth = 0.95)
plt.hist(data1['21-22'], bins = 10, rwidth = 0.95)
plt.hist(data1['22-23'], bins = 10, rwidth = 0.95)




b. Plot a histogram for individual column/ attribute of the dataset




Q2. Apply and write the significance of each of the following –


a. Y label as "Frequency":
Setting the y-axis label to "Frequency" provides a clear indication of the quantity being represented on the y-axis. 
b. Edgecolor:
The edgecolor parameter allows you to specify the color of the edges of the bars in the histogram. By setting a specific color, you can add visual distinction between the bars, making them stand out from the background or other elements in the plot.
c. Adjusting the bin size:
The bin size determines the width of the intervals or bins in the histogram. It controls how the data is grouped and displayed.
d. Autoscale:
The autoscale feature automatically adjusts the scale of the plot to fit the data. When enabled, it ensures that the entire dataset is visible within the plot area without any parts being cropped or cut off. This is particularly useful when dealing with data that has a wide range of values or when comparing multiple histograms with different data ranges.
e. Grid:
The grid feature adds a grid of horizontal and vertical lines to the plot. It provides a visual aid for interpreting the histogram by providing reference lines. The grid helps viewers gauge the frequency or count values for each bin and assists in comparing values across different bins or categories.

Q3. Draw &amp; write the details of the following types of plots-

a. Bar plot- its types
Vertical Bar Plot: The bars are displayed vertically along the y-axis, with each bar representing a different category or group.
Horizontal Bar Plot: The bars are displayed horizontally along the x-axis. This is useful when you have long category names or when you want to emphasize the comparison of values between categories.

b. Stacked plot with cmap, increase marker size
A stacked plot represents different components or subcategories within a category as stacked areas
c. Line graph
A line graph is used to visualize the relationship between two continuous variables.
d. For particular attributes use different attributes of line graph
e. Area Plot for whole dataset &amp; for any of the Column/feature
An area plot, also known as a filled line plot, is used to display the magnitude and composition of a whole dataset or a particular column/feature. 
f. Show legend
g. Move it to right and up



















# bar - vertical
plt.bar(data2.index, data2['col_1'])
plt.xticks(data2.index)
plt.show()


#Horizontal bar chart
plt.barh(data2.index, data2['col_1'])
plt.yticks(data2.index)
plt.show()

#stacked
plt.bar(data2.index, data2.col_1)
plt.bar(data2.index, data2.col_2, bottom = data2.col_1)
plt.bar(data2.index, data2.col_3, bottom = data2.col_1 + data2.col_2)
plt.legend(labels = ['Col_1', 'Col_2', 'Col_3'], loc = "upper left")
plt.show()

# line chart
plt.plot(data2['col_1'])
plt.show()



#Line chart with different attributes for each line graph
plt.plot(data2['col_1'])
plt.plot(data2['col_2'], ls = "--")
plt.legend(labels = ["Col_1", "Col_2"])
plt.show()


plt.plot(data2['col_3'], marker = "o")
plt.plot(data2['col_4'], c = 'g', lw = '2', zorder = -1)
plt.legend(labels = ["Col_3", "Col_4"])
plt.show()

#Area plot for the whole dataset
data2.plot.area()
plt.show()



data2.plot.area(y = 'col_1')





plt.plot(data2['col_1'])
plt.legend(labels = ['Col_1'], loc = "upper right")




import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

titanic = pd.read_csv("https://raw.githubusercontent.com/datasciencedojo/datasets/master/titanic.csv")
plt.figure(figsize = (15, 10))




#plot 1:
x = titanic['Age']
y = titanic['Pclass']


plt.subplot(2, 3, 1)
data = titanic.groupby("Pclass")['Fare'].mean()
plt.plot(data.index, data, 'bo' , ls = '--')
plt.xticks([1, 2, 3])
plt.xlabel('Class')
plt.ylabel('Fare')


#plot 2:
#bar
plt.subplot(2,3,2)
data = titanic['Survived'].value_counts()
plt.bar(height = data, x = data.index, color = ['grey', 'lightblue'])
plt.xticks([0, 1])


#plot 3:
#Scatter chart
plt.subplot(2,3,3)
plt.scatter(titanic['Age'], titanic['Fare'], c = titanic['Pclass'], cmap = 'viridis',)
plt.xlabel('Age')
plt.ylabel('Fare')


#plot 4:
#pie chart
plt.subplot(2,3,4)
data = titanic['Pclass'].value_counts()
plt.pie(data, autopct="%.2f", colors=[
        # matplotlib named colors
        'tomato', 'cornflowerblue', 'gold', 'orchid'])
plt.legend(labels = data.index)
plt.title("Class distribution")


#plot 5:
#histogram
plt.subplot(2,3,5)
plt.hist(titanic['Age'])
plt.xlabel("Age")
plt.ylabel("Frequency")




#plot 6:
#Area
plt.subplot(2,3,6)
index = [1, 2, 3]
count = titanic.Pclass.value_counts().reset_index().sort_values(by = 'index')['Pclass']
total = titanic.groupby("Pclass")['Fare'].sum()
plt.stackplot(index, count, total ,colors = [ 'red', 'green'])
plt.xticks(index)
plt.legend(['Count', 'Revenue Generated'])


plt.show()


Session 7 - Regression


Regression
Linear Regression model is built when the final output

Steps
- Import all Libaries
- create a DataFrame
- Draw Scatter Plot
- Create an objeect for linear regression
- Fit the Data
- Predict the sales of the house
Aim -
Description - 
Code & Output -
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn import linear_model
# regression Linear Regression

path = "/content/house-sales.csv"
data = pd.read_csv(path)
data

plt.figure(dpi=150)
plt.xlabel('Flat Area')
plt.ylabel('Sales Price')
plt.scatter(data.Area, data.Price, marker= '*' , color = "red")



reg = linear_model.LinearRegression()
reg.fit(data[['Area']],data.Price)



reg.predict([[1900]])


reg.coef_




reg.intercept_
-382191.78082192317



# y = mx + c
y = reg.coef_* 1900 + reg.intercept_
y

array([20758561.64383562])


Linear Multiple Regression

Multiple attributes are given for training 

data = pd.read_csv("/content/house.csv")
data


m = data.Bedroom.median()
data  = data.fillna(m)
data



reg = linear_model.LinearRegression()
reg.fit(data[['Area','Bedroom','Age']],data.Price)

reg.coef_


array([  116.42530538, 51260.23440079, -2013.5853417 ])


reg.intercept_
102911.05975569447


plt.scatter(data.Area, data.Price)
plt.scatter(data.Bedroom, data.Price)
plt.scatter(data.Age, data.Price)


plt.legend(labels=['Area', 'Bedroom', 'Age'])
plt.show()


plt.figure(figsize=(18,7))
plt.subplot(131)
plt.scatter(data.Area, data.Price)
plt.legend(labels=['Area'])
# plt.show()


plt.subplot(132)
plt.scatter(data.Bedroom, data.Price)
plt.legend(labels=['Bedroom'])
# plt.show()


plt.subplot(133)
plt.scatter(data.Age, data.Price)
plt.legend(labels=['Age'])
plt.show()



reg.predict([[3000,3,50]])
array([505288.41201717])

reg.predict([[2500,4,21]])
array([556729.96863651])



Logistic Regression

Is one of the technique used for binary classification.
Here, the dependent variable is binary. Which is either True or False / 1 or 0 / Yes or No

path = "/content/SampleLogi.csv"
data = pd.read_csv(path)
data





plt.figure(figsize=(18,7))
plt.subplot(131)
plt.scatter(data.Age,data.Purchased,marker='*',color='green')
plt.legend(labels=['Area'])




plt.subplot(132)
plt.scatter(data.EstimatedSalary ,data.Purchased,marker='*',color='green')
plt.legend(labels=['Bedroom'])




plt.show()





model = LogisticRegression()
model.fit(data[['Age']],data.Purchased)

array([1])
model.predict([[27]])

array([1])

if the model is performing too well on the training data but the performance drops simplicantly over the test then is called the overfitting model
model.predict(x_test)


Session 8 - Naive Bayer’s
Aim -
Description - 
Code & Output -
Flu Dataset
df = pd.read_csv("/content/flu - flu.csv")
df




x = df.drop(['Flue'],axis=1)
x



y = df['Flue']
y

one_hot_data = pd.get_dummies(x)
one_hot_data



train_df = BerNB.fit(one_hot_data,y)
train_df


prediction = train_df.predict([[0,1,1,0,1,0,0,0,1]])
prediction

array(['Y'], dtype='<U1'

prediction1 = train_df.predict([[1,0,1,0,0,1,0,1,0]])
prediction1

array(['N'], dtype='<U1'



Car Dataset
code:
import numpy as np
import pandas as pd
from sklearn.linear_model import LinearRegression, LogisticRegression
from sklearn.model_selection import train_test_split
from matplotlib import pyplot
from sklearn.naive_bayes import BernoulliNB
path = "https://raw.githubusercontent.com/kpanchal99/ML/main/car.csv"
df = pd.read_csv(path)
df

Output:


y = df['Stolen']
X = df.drop(['Stolen'], axis =1)
# one hot encoding
one_hot_data = pd.get_dummies(X, dtype=int)
one_hot_data
Output:


BerNB = BernoulliNB()
model = BerNB.fit(one_hot_data,y)
model

Output: 


model.predict([[0 ,0  ,0  ,1  ,1  ,0]])

Output: 
array(['Y'], dtype='<U1')

model.score(one_hot_data,y)
Output:
0.8




Session 9 - Decision Tree Classification

Aim -
Description - 
Code & Output -
import pandas as pd
import numpy as np
#create a dictinary
details = {
    'x1' : [1,2,3,4,5,6,7,8,9,10],
    'x2' : [11,22,33,44,55,66,77,88,99,10],
    'output' : [0,1,1,0,1,0,0,1,1,0]
}
df = pd.DataFrame(details)
df



x = df.drop('output',axis=1)
y = df.output
from sklearn.model_selection import train_test_split
x_train,x_test,y_train,y_test = train_test_split(x,y,test_size = 4)
x_train


train test split splits arrays or matrices into random train and test subsets. That means that everytime you run it without specifying random_ state, you will get a different result, this is expected behavior. random_state is the object that controls randomization during splitting


x_train,x_test,y_train,y_test = train_test_split(x,y,test_size = 4, random_state = 0)
x_train



x_train,x_test,y_train,y_test = train_test_split(x,y,test_size = 4, random_state = 42)
x_train



With random_state=O, we get the same train and test sets across diferent executions. With random_state=42, we get the same train and test sets across different executions, but in this time, the train and test sets are diferent from the previous case with random_state=0.

 data = pd.read_csv("/content/golf_df.csv")
 data


from sklearn.tree import DecisionTreeClassifier



# target attribute not applied hot encoding
x = data.drop(["Play"], axis =1 )

y = data.Play

one_hot_data = pd.get_dummies(x)
one_hot_data



clf_train = clf.fit(one_hot_data,y)
clf_train
import matplotlib.pyplot as plt
tree.plot_tree(clf_train)

tree.plot_tree(clf_train, feature_names = list(one_hot_data.columns.values),rounded = True, filled = True)
plt.savefig("out_playgolf.pdf")



- More Gini Index = more Impure =1 impure class
- Less gini Index -= less impure class
- Gini Index = Pure Class
- Its a leaf node and further cant be split

prediction = clf_train.predict([[False,0  ,0  ,1  ,0  ,1  ,0,0,1]])
prediction

array(['yes']

x_train,x_test,y_train,y_test = train_test_split(one_hot_data,y,test_size = 0.3, random_state =42 )
x_train



clf_train = clf.fit(x_train,y_train)


y_pred = clf.predict(x_test)   # y_pred with y_test
y_pred

array(['yes', 'no', 'no', 'yes', 'yes'], dtype=object)

confusion_matrix(y_test,y_pred)

array([[1, 1],
       [1, 2]])

accuracy_score(y_test,y_pred)
0.6

from sklearn.metrics import precision_score
precision_score(y_test,y_pred,average = None)
array([0.5       , 0.66666667])


from sklearn.metrics import recall_score
recall_score(y_test,y_pred,average = None)

array([0.5       , 0.66666667])





PIMA Dataset
import pandas as pd
import matplotlib.pyplot as plt
from sklearn.tree import DecisionTreeClassifier
from sklearn.model_selection import train_test_split
from sklearn.metrics import confusion_matrix, accuracy_score, precision_score, recall_score
from sklearn import tree


df= pd.read_csv("/content/diabetes.csv")
df





x= df.drop(['Outcome'],axis=1)
x





y= df['Outcome']
clf= tree.DecisionTreeClassifier()
clf_train= clf.fit(x,y)
clf_train






tree.plot_tree(clf_train, feature_names = list(x.columns.values), rounded = True, filled = True)
plt.show()



# split n train the data
x_train, x_test, y_train, y_test= train_test_split(x,y,test_size=0.3,random_state=42)
x_train



clf= clf.fit(x_train, y_train)
y_pred= clf.predict(x_test)
y_pred



### Confusion Matrix
A confusion matrix is a matrix that summarizes the performance of a machine learning model on a set of test data. It is a means of displaying the number of accurate and inaccurate instances based on the model’s predictions. It is often used to measure the performance of classification models, which aim to predict a categorical label for each input instance.


The matrix displays the number of instances produced by the model on the test data.


- True positives (TP): occur when the model accurately predicts a positive data point.
- True negatives (TN): occur when the model accurately predicts a negative data point.
- False positives (FP): occur when the model predicts a positive data point incorrectly.
- False negatives (FN): occur when the model mispredicts a negative data point.

### Confusion Matrix
confusion_matrix(y_test, y_pred)


ac = accuracy_score(y_test,y_pred)
precision= precision_score(y_test, y_pred, average= None)
recall= recall_score(y_test,y_pred, average= None)
F1_score= 2*(precision * recall)/ (precision + recall)
print(F1_score,recall,precision)

array([[106,  45],
       [ 27,  53]])
0.6883116883116883  		
 array([0.79699248, 0.54081633])     
array([0.70198675, 0.6625    ])
array([0.74647887, 0.59550562])






Session 10 K-Nearest Neighbour Classification

Aim -
Description - 
Code & Output -

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.tree import DecisionTreeClassifier
from sklearn.model_selection import train_test_split
from sklearn.neighbors import KNeighborsClassifier
from sklearn.metrics import confusion_matrix, precision_score, recall_score, accuracy_score, f1_score, classification_report
#read file
df = pd.read_csv("/content/Social_Network_Ads - Social_Network_Ads.csv")
df



#data preprocessing
x= df.iloc[:,0:3]
x.head()



y= df.iloc[:,-1]
y



# object creation
KNN = KNeighborsClassifier()
KNN.fit(x_train,y_train)




y_pred=KNN.predict(x_test)
y_pred


array([0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0,
       0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1,
       0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1,
       0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0,
       0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1])


accuracy_score(y_test,y_pred)

0.75

KNN= KNeighborsClassifier(n_neighbors=3,weights='distance',p=2,metric='euclidean')
KNN.fit(x_train,y_train)
y_pred=KNN.predict(x_test)
accuracy_score(y_test,y_pred)


KNN= KNeighborsClassifier(n_neighbors=2,weights='uniform',algorithm='brute')
KNN.fit(x_train,y_train)
y_pred=KNN.predict(x_test)
accuracy_score(y_test,y_pred)

Iris Dataset
# read csv
data = pd.read_csv('/content/result.csv')
data


# data pre processing -  axis column = 1
x = data.drop(["Result"] ,axis = 1)
x


#
y = data.Result
# create object
from sklearn.neighbors import KNeighborsClassifier
knn = KNeighborsClassifier(n_neighbors=2)


# train fit
knn.fit(x,y)




predict
pred = knn.predict([[6,8]])
pred


array(['Pass'], dtype=object)

pred = knn.predict([[2,3]])
pred

array(['Fail'], dtype=object

x_train,x_test,y_train,y_test = train_test_split(x,y, test_size=0.3,random_state = 42)
x_train


knn.fit(x_train, y_train)



clf = tree.DecisionTreeClassifier()
clf = clf.fit(x_train, y_train)
clf


y_pred = clf.predict(x_test)
y_pred

from sklearn.metrics import confusion_matrix
confusion_matrix(y_test,y_pred)
array([[0, 0],
       [1, 1]])

df = pd.read_csv('/content/Iris.csv')
df.head()



x = df.drop(["Species"], axis = 1)
x


y = df.Species
y


x_train,x_test,y_train,y_test = train_test_split(x,y, test_size=0.3,random_state = 42)



model = KNeighborsClassifier()
model.fit(x_train,y_train)



y_pred = model.predict(x_test)
y_pred





cm = confusion_matrix(y_test,y_pred)
cm

array([[19,  0,  0],
       [ 0, 13,  0],
       [ 0,  0, 13]])








Session 11 SVM 

Aim -
Description - 
Code & Output

import pandas as pd
import numpy as np
from sklearn.svm import SVC
from sklearn.model_selection import train_test_split
#read data
data = pd.read_csv("/content/Social_Network_Ads.csv")
data.head()




x = data.drop(["Purchased"], axis = 1)
x

y = data.Purchased
y


x_train,x_test,y_train,y_test = train_test_split(x,y, test_size = 0.25, random_state = 42)
x_train


Kernel Trick
A Kernel is a function used in SVM for helping to solve problems
model = SVC(kernel = "rbf")
model.fit(x_train,y_train)

y_pred = model.predict(x_test)
y_pred

from sklearn import metrics
metrics.accuracy_score(y_test,y_pred)
0.63
model = SVC(kernel = "poly")
model

model.fit(x_train,y_train)
metrics.accuracy_score(y_test,y_pred)
0.63

model = SVC(kernel = "linear")
model.fit(x_train,y_train)
metrics.accuracy_score(y_test,y_pred)
0.63

model = SVC(kernel = "rbf", gamma=15,C=7)
model.fit(x_train,y_train)



y_pred = model.predict(x_test)


metrics.accuracy_score(y_test,y_pred)
0.63

Session 12 Random Forest Classification 


Aim -
Description - 
Code & Output -

Session 13 Bagging Classification 
Aim -
Description - 
Code & Output -

Heart Dataset

Heart Dataset
import numpy as np
import pandas as pd
df= pd.read_csv("/content/Heart.csv")
df

print("Number of Records:", df.shape[0])
print("Number of Features:", df.shape[1])

df.info()

# Summary of All Numerical Data
df.describe().T

# Summary of All Categorical Data
df.describe(include="object").T

# Check Nan Values
df.isna()

# Check Nan Values
df.isna().sum()

df.duplicated()

# Check Duplicates Records
df.duplicated().sum()
Categorical Data Encoding
df.select_dtypes(include="object")

df.select_dtypes(object).columns

df_encodded = pd.get_dummies(df, columns=['Sex', 'ChestPainType', 'RestingECG', 'ExerciseAngina', 'ST_Slope'], drop_first="True")
df_encodded

df_encodded = pd.get_dummies(data=df, columns=['Sex', 'ChestPainType', 'RestingECG', 'ExerciseAngina', 'ST_Slope'])
df_encodded

X = df_encodded.drop(columns=["HeartDisease"])
y = df_encodded["HeartDisease"]
X = df_encodded.drop(["HeartDisease"], axis=1)
y = df_encodded["HeartDisease"]
from sklearn.model_selection import train_test_split
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)
from sklearn.ensemble import BaggingClassifier
from sklearn.svm import SVC
bag_model_SVC = BaggingClassifier(
    estimator=SVC(),
    n_estimators=100,
     oob_score=True,
    random_state=42)
bag_model_SVC.fit(X_train, y_train)
bag_model_SVC.oob_score_

from sklearn.tree import DecisionTreeClassifier
bag_model_DT = BaggingClassifier(
    estimator=DecisionTreeClassifier(),
    n_estimators=100,
    max_samples=0.8,
    oob_score=True,
    random_state=42
)
bag_model_DT.fit(X_train, y_train)
bag_model_DT.oob_score_
from sklearn import tree
model_DT = tree.DecisionTreeClassifier()
model_DT.fit(X_train, y_train)


from sklearn.metrics import accuracy_score
y_pred=model_DT.predict(X_test)
accuracy_score(y_test, y_pred)

from sklearn.model_selection import cross_val_score
scores = cross_val_score(model_DT, X, y, cv=5)
scores

scores.mean()

from sklearn.svm import SVC
rbf_model = SVC(kernel="rbf")
rbf_model.fit(X_train, y_train)
y_pred = rbf_model.predict(X_test)
y_pred

acc = accuracy_score(y_test, y_pred)
acc

scores_SVC = cross_val_score(rbf_model, X, y, cv=5)
scores_SVC



scores_SVC.mean()
from sklearn.model_selection import cross_val_score
scores = cross_val_score(bag_model_DT, X, y, cv=5)
scores
scores.mean()
from sklearn.model_selection import cross_val_score
scores = cross_val_score(bag_model_SVC, X, y, cv=5)
scores
scores.mean()


Pima Dataset - Diabetes

import numpy as np
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.ensemble import BaggingClassifier
from sklearn.svm import SVC
df = pd.read_csv('diabetes.csv')
df.head()



print("Number of Records",df.shape[0])
print("Number of Features",df.shape[1])
Number of Records 768
Number of Features 9

df.info()



df.describe().T


df.isna().sum()

df.duplicated().sum()
0

df.select_dtypes(include="object")
df.select_dtypes(object).columns



Index([], dtype='object')

X = df.drop(columns=['Outcome'])
y = df['Outcome']
X_train,X_test,y_train,y_test = train_test_split(X,y,test_size=0.2, random_state=42)

bag_model1 = BaggingClassifier(estimator=SVC(),n_estimators=100,oob_score=True, random_state=42)
bag_model1.fit(X_train,y_train)



bag_model1.oob_score_

0.757328990228013

from sklearn.tree import DecisionTreeClassifier
bag_model1 = BaggingClassifier(estimator=DecisionTreeClassifier(),n_estimators=100,max_samples=0.8,oob_score=True, random_state=42)
bag_model1.fit(X_train,y_train)
bag_model1.oob_score_

0.7719869706840391


from sklearn import tree
model = tree.DecisionTreeClassifier()
model.fit(X_train,y_train)


from sklearn.metrics import accuracy_score
y_pred = model.predict(X_test)
accuracy_score(y_test,y_pred)
0.7402597402597403
from sklearn.svm import SVC
rbf_model = SVC(kernel='rbf')
rbf_model.fit(X_train,y_train)
y_pred = rbf_model.predict(X_test)
y_pred
acc = accuracy_score(y_test,y_pred)
acc
0.7662337662337663


Session 14 K-Fold Crossvalidation

Aim -
Description - 
Code & Output -

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn import linear_model
from sklearn.linear_model import LogisticRegression
from sklearn.model_selection import train_test_split
path = "/content/SampleLogi.csv"
df = pd.read_csv(path)
df





plt.figure(figsize=(18,7))
plt.subplot(131)
plt.scatter(data.Age,data.Purchased,marker='*',color='green')
plt.legend(labels=['Area'])




plt.subplot(132)
plt.scatter(data.EstimatedSalary ,data.Purchased,marker='*',color='green')
plt.legend(labels=['Bedroom'])




plt.show()


model = LogisticRegression()
model.fit(data[['Age']],data.Purchased)

model.predict([[27]])
array([0])
x_train,x_test,y_train,y_test = train_test_split(data[['Age']], data.Purchased, test_size = 0.2)
model.fit(x_train,y_train)
model.predict(x_test)


array([1, 1, 1, 1, 1, 1])


from sklearn.metrics import accuracy_score
y_pred = model.predict(x_test)
accuracy_score(y_test,y_pred)
df['Gender'].replace({'Male':1,'Female':0},inplace= True)
df.head()



x = df.drop(['Purchased'],axis=1)
y = df['Purchased']

from sklearn.model_selection import cross_val_score
scores = cross_val_score (model,x,y,cv = 5)
scores
scores.mean()
0.7







Session 15 K Means Clustering
Aim -
Description - 
Code & Output -


Income Dataset
import numpy as np
import pandas as pd
from matplotlib import pyplot as plt
from sklearn.cluster import KMeans
import warnings
warnings.filterwarnings('ignore')
df = pd.read_csv("income.csv")
df

plt.scatter(df.Age,df.Income)

km = KMeans(n_clusters = 3)
km
y_predict=km.fit_predict(df[['Age','Income']])
y_predict
df['Cluster'] = y_predict
df
\

#separate 3 clusters into 3 dataframes
df1 = df[df.Cluster == 0 ]
df2 = df[df.Cluster == 1 ]
df3 = df[df.Cluster == 2 ]
plt.scatter(df1.Age,df1.Income,color='red',label='df1')
plt.scatter(df2.Age,df2.Income,color='blue',label='df2')
plt.scatter(df3.Age,df3.Income,color='green',label='df3')
plt.xlabel('Age')
plt.ylabel('Income')
plt.legend()

#feature scaling
from sklearn.preprocessing import MinMaxScaler
scaler = MinMaxScaler()
scaler.fit(df[['Income']])
df['Income'] = scaler.transform(df[['Income']])
scaler.fit(df[['Age']])
df['Age'] = scaler.transform(df[['Age']])
df

y_predict

y_predict=km.fit_predict(df[['Age','Income']])
y_predict
df['Cluster'] = y_predict
df


df1 = df[df.Cluster == 0 ]
df2 = df[df.Cluster == 1 ]
df3 = df[df.Cluster == 2 ]


plt.scatter(df1.Age,df1.Income,color='red',label='df1')
plt.scatter(df2.Age,df2.Income,color='blue',label='df2')
plt.scatter(df3.Age,df3.Income,color='green',label='df3')
plt.xlabel('Age')
plt.ylabel('Income')
plt.legend()

km.cluster_centers_

plt.scatter(km.cluster_centers_[:,0],km.cluster_centers_[:,1],color="purple",marker="*")
plt.scatter(df1.Age,df1.Income,color='red',label='df1')
plt.scatter(df2.Age,df2.Income,color='blue',label='df2')
plt.scatter(df3.Age,df3.Income,color='green',label='df3')
plt.xlabel('Age')
plt.ylabel('Income')
plt.legend()

Country Dataset

Session 16 Elbow Method
Aim -
Description - 
Code & Output -

Mall Customer
import pandas as pd
df=pd.read_csv("/content/Mall_Customers.csv")
df

df.info()

df.describe()

x=df.iloc[:,[3,4]].values
x

from sklearn.cluster import KMeans
kmeans=KMeans(n_clusters=3)
y_pred=kmeans.fit_predict(x)
print(y_pred)

import warnings
warnings.filterwarnings('ignore')
kmeans.cluster_centers_

Sum_of_squared_distances=[]
K=range(1,10)
for k in K:
  km=KMeans(n_clusters=k)
  km=km.fit(x)
  Sum_of_squared_distances.append(km.inertia_)
Sum_of_squared_distances

# Plot Sum_of_squared_distances & determine optimal k using Elbow method
import matplotlib.pyplot as plt
plt.plot(range(1,10),Sum_of_squared_distances)
plt.title('Elbow method')
plt.xlabel('No of Clusters')
plt.ylabel('Sum_of_squared_distances')
plt.show()

Session 17 Gradient Boosting


Aim -
Description - 
Code & Output -

Salary dataset

import pandas as pd
from sklearn.ensemble import GradientBoostingRegressor
df=pd.read_csv("/content/salary_pre_data.csv")
df

df.info()

df.describe()

df.isna().sum()

from sklearn.preprocessing import LabelEncoder
le=LabelEncoder()
df.Degree=df.Degree=le.fit_transform(df.Degree)
df.Degree

df.Degree.value_counts()

X=df.drop(['Salary'], axis=1)
y=df['Salary']
from sklearn.model_selection import train_test_split
X_train,X_test, y_train, y_test= train_test_split(X, y, test_size=30, random_state=42)
from sklearn import linear_model
reg=linear_model.LinearRegression()
reg.fit(X_train, y_train)
y_pred=reg.predict(X_test)
y_pred

from sklearn.metrics import accuracy_score
accuracy_score(y_test,y_pred)

Above Error says that we can not apply accuracy_score metric on Regression as it is a metric that is used with classification.
from sklearn.metrics import r2_score
accuracy = r2_score(y_test, y_pred)
accuracy

gbModel= GradientBoostingRegressor(random_state=42)



gbModel.fit(X_train, y_train)
y_pred_gb=gbModel.predict(X_test)
accuracy_Boosted = r2_score(y_test, y_pred)
accuracy_Boosted

gbModel= GradientBoostingRegressor(n_estimators=100, learning_rate=0.5, random_state=42)
gbModel.fit(X_train, y_train)
y_pred_gb=gbModel.predict(X_test)
accuracy_Boosted = r2_score(y_test, y_pred)
accuracy_Boosted

gbModel= GradientBoostingRegressor(n_estimators=900, learning_rate=0.8, random_state=42)
gbModel.fit(X_train, y_train)
y_pred_gb=gbModel.predict(X_test)
accuracy_Boosted = r2_score(y_test, y_pred)
accuracy_Boosted

gbModel= GradientBoostingRegressor(n_estimators=900, learning_rate=0.8, random_state=42)
gbModel.fit(X_train, y_train)
y_pred_gb=gbModel.predict(X_test)
accuracy_Boosted = r2_score(y_test, y_pred)
accuracy_Boosted




