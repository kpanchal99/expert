
                                                    		      


Department of Data Science & Technology


Certificate


Masters in Computer Applications
Semester II (2023 – 24)


This is to certify that Ms. Pranjal Pradeep Sawant  Roll No. 17030923047 of MCA, has satisfactorily completed the practical course “Machine Learning
Lab” prescribed by the College for the Partial fulfillment of the Degree  by the Somaiya Vidyavihar University, during the academic year 2023-25. 






Signature of the Faculty-Incharge	    	               Signature of the Programme Coordinator    
      Dr. Krantee Jamdaade                                                    Dr. Bharati Wukkadada








  Date of Examination			               Signature of the External Examiner/s
       20th June 2024
		       


   
INDEX


SR NO.
DATE
TITLE
PAGE NO
1
29/02/24
Basics of Numpy


2
07/02/24
Apriori Code
Purchased Dataset
Fashion Dataset


3
12/02/24
Introduction to Pandas


4
12/02/24
Data Pre-processing
Temperature Dataset


5
13/02/24
Seaborn
Titanic Dataset


6
14/02/24
Matplotlib
Titanic Dataset


7
21/02/24
Regression
Linear
House Price Dataset
Salary Dataset
Multiple
Logistic
Purchased Dataset


8
18/03/24
Navies Bayes
Flue Dataset
Car Dataset


9
01/04/24
Decision Tree Classification
Golf Dataset
PIMA Dataset
Iris Dataset






10
03/04/24
K-Nearest Neighbour Classification
Social Network Dataset
Iris Dataset


11
03/04/24
Support Vector Machine
Social Network Dataset


12
08/04/24
Random Forest Classification
Titanic Dataset


13
10/04/24
Bagging Classification
Heart Dataset
PIMA Dataset


14
10/04/24
Logistic Regression With K-Fold Cross Validation


15
15/04/24
K-Means Clustering
Income Dataset
Country Dataset


16
22/04/24
Elbow Method
Mall Customers Dataset


17
22/04/24
Gradient Boosting Regressor
Salary Dataset




Session 1 - Basics of Numpy	


Aim - To understand the basics of numpy by creating an array, list, tuples, 2D array, 3D array etc.

Description - 


Code & Output - 

import numpy as np
np.__version__
#create on array
arr = np.array ([1,2,3,4])
print(arr)
print (type(arr))


List
#list
a = ["mca", 55, 66]
arr2 = np.array(a)
print(arr2)
print(type(a))


Tuple
#tuple
t1 = ("pranjal" , 23 )
tup1 = np.array(t1)
print(t1)
print(type(t1))




2D Array
#2D array
arr3 = np.array([[1,2,3],[3,4,5]])
print(arr3)
print(arr3.shape)


3D array
#create a 3-d array with two 2-d array
arr4 =  np.array([[[1,2,3],[4,5,6]],[[1,2,4],[2,3,4]]])
print(arr4)
print(arr4.shape)


Accessing Arrays
#accessing arrays
print(arr[0])
print(arr[2])
print("sum" , arr[1]+arr[3])



Session 2 - Apriori Code

Aim - To understand the Apriori Algorithm
Description - 

Code & Output - 



import numpy as np
import pandas as pd
# select local files
from google.colab import files
uploaded = files.upload()

#convert file to dataframe
import io
df = pd.read_csv(io.BytesIO(uploaded['puchased_data.csv']))
print(df)




#mounting google drive
from google.colab import drive
drive.mount('/content/drive')
path = "/content/drive/MyDrive/Sem 2/ML/puchased_data.csv"
df = pd.read_csv(path)
print(df)
url = "https://media.githubusercontent.com/media/datablist/sample-csv-files/main/files/leads/leads-100.csv"
df1 = pd.read_csv(url)
print(df1)
apr_df = pd.read_csv("/content/puchased_data.csv",header = None)
print(apr_df)

records = []
for i in range(0, len(apr_df)):
  temp = []
  for j in range(0, 4):
    if str(apr_df.values[i, j]) != 'nan':
      temp.append(str(apr_df.values[i, j]))
  records.append(temp)
print(records)



!pip install apyori
from apyori import apriori
association_rules = apriori(records,min_support = 0.5, min_confidence = 0.75)
association_results  = list(association_rules)
print(association_results)


apr_df2 = pd.read_csv("/content/fashion_data - fashion_data.csv",header = None)
print(apr_df2)

records2 = []
for i in range(0, len(apr_df2 )):
  temp = []
  for j in range(0, 4):
    if str(apr_df2 .values[i, j]) != 'nan':
      temp.append(str(apr_df2 .values[i, j]))
  records2.append(temp)
print(records2)


assoc_rule = apriori(records2, min_support = 0.4, min_confidence = 0.6)
assiociation_result = list(assoc_rule)
print(assiociation_result)

Session 3 - Introduction to Pandas

Aim - To understand pandas
Description - 

Code & Output -

Pandas Series
Scalar values
import pandas as pd
s1 = pd.Series(5)
print(s1)

s2 = pd.Series(5,index=[0,1,2,3])
print(s2)


Array
import numpy as np
data = np.array([33,44,55,66])
s3 = pd.Series(data)
print(s3)

data = np.array([33,44,55,66])
s4 = pd.Series(data,index=["a","b","c","d"])
print(s4)

Dictionary
dict = {'a':111,'b':222,'c':333}
s5 = pd.Series(dict)
print(s5)

dict = {'p':101,'q':102,'r':103,'s':104}
s6 = pd.Series(dict)
print(s6)


DataFrame

A pandas dataframe can be created using the following constructor - 
pandas.DataFrame(data, index, columns, dtype)
Data - values to be passed in dataframe
Index - used to label index for rows
Columns - used to label index for rows
Dtype - used to define data type for columns

apple = [10,20,30,40]
banana = [11,22,33,44]
df1 = pd.DataFrame([apple,banana])
print(df1)

apple = [10,20,30,40]
banana = [11,22,33,44]
df1 = pd.DataFrame([apple,banana], index = ['apple', 'banana'],columns=['jan','feb','mar','apr'])
df1

apple = [10,20,30,40]
banana = [11,22,33,44]
orange = [55,66,77,88,99]
rw = ['apple', 'banana' , 'orange']
cl = ['jan','feb','mar','apr','may']
df1 = pd.DataFrame([apple,banana,orange],index=rw,columns=cl)
df1


s1 = pd.Series([10,20,30],index=[1,2,3])
df2 = pd.DataFrame(s1)
s2 = pd.Series([100,200,300],index=[1,2,3])
df3 = pd.DataFrame([s1,s2])
df3

s1 = pd.Series([10,20,30],index=['jan','feb','mar'])
df2 = pd.DataFrame(s1)
s2 = pd.Series([100,200,300],index=['jan','feb','mar'])
df3 = pd.DataFrame([s1,s2], index=['sale1','sale2'])
df3

s3 = pd.Series(['kabadi','hockey','voleyball'])
s4 = pd.Series([7,12,5])
dict = {'sports':s3,'no of players': s4}
df5 = pd.DataFrame(dict)
df5

s3 = pd.Series(['kabadi','hockey','voleyball'])
s4 = pd.Series([7,12,5])
dict = {'sports':s3,'no of players': s4}
df5 = pd.DataFrame(dict, index=['r1','r2','r3'])
df5




import pandas as pd
dict1 = {
    'Manager':{'IT Support': 'PS', 'Operations': 'Karan'},
    'Engineer': {'IT Support':'KP', 'Operations': 'Pranjal'}
}
df1 = pd.DataFrame(dict1)
df1

#create dataframe using numpy array
import pandas as pd
import numpy as np
# creating the Numpy array
array = np.array([['Pranjal', 'Karan'], ['Vijay', 'Falguni'],
        ['Nilesh', 'Mrunal'], ['Pratik', 'Nidhi']])
# creating a list of index names
index_values = ['IT Support', 'Operations','System Infrastructure', 'Info Security']
# create a list of column names
column_values = ['Manager', 'Engineer']
# create the dataframe
df = pd.DataFrame(data = array,
        index = index_values,
        columns = column_values)
# display
df

df.to_csv('EmpDetail.csv')

df.to_csv('SampleData.csv', index=False)

dict3 = {
    'Sports':{'0': 'Kabaddi', '1': 'kho-kho','2':'volly ball'},
    'No of Players': {'0':'7', '1': '12','2':'5'}
}
df3 = pd.DataFrame(dict3)
df3

#with index
df3.to_csv('Player.csv')
#without index
df3.to_csv('PlayerWithoutindex.csv', index=False)


df.tail(2)


df.head(2)

Session 4 - Data Pre Processing

Aim - To understand data pre processing 
Description - 

Code & Output - 
Create and read an excel file

import pandas as pd
weather =pd.read_csv('Weather.csv')
weather

Fills NaN values to 0



df.fillna(0)


Creates a dictionary and replaces the NaN values according to the columns

newdf = df.fillna({
    'temperature':0,
    'windspeed': 0,
    'event': 'No event'
})
newdf

Forward Fill

newdf = df.fillna(method="ffill")
newdf

Backward Fill
newdf = df.fillna(method="bfill")
newdf


Mean Value

newdf = df.interpolate()
newdf

newdf = df.fillna({'event': 'No event'})
new1 = newdf.interpolate()
new1


Drops the rows with nan values

newdf = df.dropna()
newdf


Session 5 - Seaborn

Aim -  To understand the working of seaborn

Description - 


Code & Output - 

Matplotlib and Operations
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt


url = "https://raw.githubusercontent.com/datasciencedojo/datasets/master/titanic.csv"
titanic = pd.read_csv(url)
titanic

titanic.head()



titanic.tail()

import seaborn as sns
sns.heatmap(titanic.isnull())

sns.countplot(data=titanic,x="Survived")

sns.countplot(data=titanic,x="Survived",hue="Sex")

sns.countplot(data=titanic,x="Survived",hue="Pclass")

sns.distplot(titanic['Age'])

sns.displot(titanic['Age'])

sns.distplot(titanic['Age'],kde=False)

#matplotlib
titanic['Age'].hist()

#Data Cleaning
sns.boxplot(data=titanic, x = 'Pclass', y ='Age')

sns.boxplot(x=titanic.Pclass,y=titanic.Age)

titanic.groupby('Pclass').mean()

titanic.groupby('Pclass').mean()['Age']

Data Cleaning
def impute_age(cols):
  Age=cols[0]
  Pclass=cols[1]
  if pd.isnull(Age):
    if Pclass==1:
      return 38
    elif Pclass==2:
      return 30
    else:
      return 25
  else:
    return Age


titanic[['Age','Pclass']].apply(impute_age, axis=1)

def impute_age(cols):
  Age=cols[0]
  Pclass=cols[1]
  if pd.isnull(Age):
    if Pclass==1:
      return 38
    elif Pclass==2:
      return 30
    else:
      return 25
  else:
    return Age


titanic['Age'] = titanic[['Age','Pclass']].apply(impute_age, axis=1)

titanic['Age'].isnull()

titanic['Age'].isnull().sum()

titanic.drop('Cabin',axis=1,inplace=True)

titanic_cat = titanic.select_dtypes(object)
titanic_cat

titanic_num = titanic.select_dtypes(['int64', 'float64'])
titanic_num

from sklearn.preprocessing import LabelEncoder
le=LabelEncoder()
le.fit_transform(titanic_cat['Embarked'])

Session 6 - Matplotlib

Aim - To understand matplotlib
Description - 

Code & Output -

Python package for visualization

import matplotlib.pyplot as plt
x = [1,2,3,4,5,6,7]
y = [40,41,42,38,37,39,36]
plt.plot(x,y)

x = [1,2,3,4,5,6,7]
y = [40,41,42,38,37,39,36]
plt.plot(x,y,color="Purple")

x = [1,2,3,4,5,6,7]
y = [40,41,42,38,37,39,36]
plt.plot(x,y,color="Purple",linestyle="--",linewidth=5)


plt.xlabel('Days')
plt.ylabel('Temperature')
plt.title("Weather")
plt.plot(x,y,color="Purple",linestyle=":",linewidth=1)

plt.xlabel('Days')
plt.ylabel('Temperature')
plt.title("Weather")
plt.plot(x,y,color="Purple",linestyle=" ",linewidth=1,marker="*")


company = ["GOOGL","AMZN","MSFT","FB"]
revenue = [90,136,89,27]
plt.bar(company,revenue)

company = ["GOOGL","AMZN","MSFT","FB"]
revenue = [90,136,89,27]
plt.ylabel('Revenue in billions')
plt.title('US Tech Stocks')
plt.bar(company,revenue)

blood = [113,85,90,150,149,88,93,115,135,80,77,82,129]
plt.hist(blood)

plt.hist(blood,bins=3,rwidth=0.95)

plt.hist(blood,bins=[80,100,125,150],rwidth=0.95)

blood_sugar_women = [67,98,89,120,133,150,34,49,89,79,129,112,100]
plt.hist([blood,blood_sugar_women],bins = [80,100,125,150], rwidth = 0.95, label=['Men','Women'])
plt.legend()

blood_sugar_women = [67,98,89,120,133,150,34,49,89,79,129,112,100]
plt.hist([blood,blood_sugar_women],bins = [80,100,125,150], rwidth = 0.95, label=['Men','Women'])
plt.legend()
plt.xlabel("Sugar Range")
plt.ylabel("Total Number of pts")
plt.title("Blood Sugar Analysis")

blood_sugar_women = [67,98,89,120,133,150,34,49,89,79,129,112,100]
plt.hist([blood,blood_sugar_women],bins = [80,100,125,150], rwidth = 0.95, label=['Men','Women'],orientation="horizontal")
plt.legend()
plt.xlabel("Sugar Range")
plt.ylabel("Total Number of pts")
plt.title("Blood Sugar Analysis")


Session 7 - Regression 

Aim - To understand regression
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
plt.scatter(df.Area,df.Price,marker="+",color="red")

reg = linear_model.LinearRegression()
reg.fit(df[['Area']],df.Price)


reg.coef_
reg.intercept_

plt.figure(dpi=150)
plt.xlabel('years')
plt.ylabel('salary')
plt.scatter(df1.years,df1.salary,marker="*",color="red")

reg = linear_model.LinearRegression()
reg.fit(df[['Area']],df.Price)


reg.coef_
reg.intercept_

df2 = pd.read_csv("house.csv")
df2

plt.scatter(df2.Area, df2.Price)
plt.scatter(df2.Bedroom, df2.Price)
plt.scatter(df2.Age, df2.Price)


plt.legend(labels=['Area', 'Bedroom', 'Age'])
plt.show()

plt.figure(figsize=(20,5))
plt.subplot(131)
plt.scatter(df2.Area, df2.Price, color="red")
plt.legend(labels = ['Area'])


plt.subplot(132)
plt.scatter(df2.Bedroom, df2.Price, color="green")
plt.legend(labels = ['Bedroom'])


plt.subplot(133)
plt.scatter(df2.Age, df2.Price)
plt.legend(labels = ['Age'])
plt.show()

m = df2.Bedroom.median()
df2 = df2.fillna(m)
df2

reg = linear_model.LinearRegression()
reg.fit(df2[['Area','Bedroom','Age']],df2.Price)
reg.coef_
reg.intercept_
reg.predict([[3000,3,50]])
reg.coef_[0]*3000 + reg.coef_[1] * 3 + reg.coef_[2] * 50
reg.coef_[0]*3000 + reg.coef_[1] * 3 + reg.coef_[2] * 50

plt.figure(figsize=(20,5))
plt.subplot(131)
plt.scatter(df.Age,df.Purchased, marker="*", color="red")
plt.legend(labels = ['Age'])


plt.subplot(132)
plt.scatter(df.EstimatedSalary,df.Purchased, marker="*", color="darkblue")
plt.legend(labels = ['EstimatedSalary'])
plt.show()



model = LogisticRegression()
model.fit(df[['Age']],df.Purchased)
model.predict([[27]])

model.predict([[57]])

x_train,x_test,y_train,y_test = train_test_split(df[['Age']],df.Purchased,test_size=0.2)
model.fit(x_train,y_train)
model.predict(x_test)

Random state
import pandas as pd
from sklearn.model_selection import train_test_split
# create dictionary
details = {
    'x1':[1,2,3,4,5,6,7,8,9,10],
    'x2':[11,22,33,44,55,66,77,88,99,100],
    'output' : [0,1,1,0,1,0,0,1,1,0]
}


#create df
df = pd.DataFrame(details)
df

x = df.drop('output',axis=1)
y = df.output
x_train,x_test,y_train,y_test = train_test_split(x,y)
x_train

Decision Tree Code
ds = pd.read_csv('golf.csv')
ds

x = ds.drop('Play',axis=1)
y = ds.Play


one_hot_data = pd.get_dummies(x)
from sklearn import tree
clf = tree.DecisionTreeClassifier()
clf_train = clf.fit(one_hot_data,y)
tree.plot_tree(clf_train)

Confusion Matrix is a performance measurement of any classification algorithm

Session 8 - Naive Bayes

Aim - To understand Naive Bayes
Description - 

Code & Output -
import pandas as pd
import numpy as np


from sklearn.naive_bayes import BernoulliNB
df = pd.read_csv("/content/flu - flu.csv")
df

x = df.drop(['Flue'],axis=1)
x

y = df['Flue']
y

BerNB = BernoulliNB()
BerNB.fit(x,y)
one_hot_data = pd.get_dummies(x)
one_hot_data

train_df = BerNB.fit(one_hot_data,y)
train_df
prediction = train_df.predict([[0,1,1,0,1,0,0,0,1]])
prediction
prediction1 = train_df.predict([[1,0,1,0,0,1,0,1,0]])
prediction1


data = pd.read_csv("/content/car_theft.csv")
data

x = data.drop(['Stolen'],axis=1)
x

y = data['Stolen']
y

one_hot_data = pd.get_dummies(x)
one_hot_data

train_data = BerNB.fit(one_hot_data,y)
train_data

prediction = train_data.predict([[1,0,1,0,1,0]])
prediction

Session 9 - Decision Tree Classification

Aim - To understand the decision tree	classification
Description - 
	
Code & Output -

#import libraries
import pandas as pd
import matplotlib.pyplot as plt
from sklearn import tree
from sklearn.tree import DecisionTreeClassifier
from sklearn.model_selection import train_test_split
from sklearn.metrics import confusion_matrix, accuracy_score, precision_score, recall_score
#read data
df= pd.read_csv("diabetes - diabetes.csv")
df

#preprocessing
x= df.drop(['Outcome'],axis=1)
x

y= df['Outcome']
y
#decision tree algorithm
clf= tree.DecisionTreeClassifier()
clf
clf_train= clf.fit(x,y)
clf_train
tree.plot_tree(clf_train)
plt.show()

tree.plot_tree(clf_train, feature_names=list(x.columns.values),rounded=True, filled= True)
plt.show()

x_train, x_test, y_train, y_test= train_test_split(x,y,test_size=0.3,random_state=42)
clf= clf.fit(x_train, y_train)
y_pred= clf.predict(x_test)
y_pred

confusion_matrix(y_test, y_pred)

accuracy_score(y_test,y_pred)

precision= precision_score(y_test, y_pred, average= None)
precision

recall= recall_score(y_test,y_pred, average= None)
recall
F1_score= 2*(precision * recall)/ (precision + recall)
F1_score




Session 10 - K-Nearest Neighbour Classification

Aim - To understand K-nearest neighbor classification
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






Session 11 - Support Vector Machine

Aim - To understand support vector machine
Description - 

Code & Output -
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
Session 12 - Random Forest Classification

Aim - To understand the random forest classification
Description - 

Code & Output -
import numpy as np
import pandas as pd
from sklearn.preprocessing import LabelEncoder
from sklearn.model_selection import train_test_split
from sklearn.ensemble import AdaBoostClassifier
from sklearn.metrics import accuracy_score
from sklearn.tree import DecisionTreeClassifier
df = pd.read_csv('Titanic.csv')
df.head()
new_df = df.dropna()
new_df

x = new_df.drop(['survived','embarked','class','who','alone','sex'],axis=1)
y = new_df['survived']
x

le = LabelEncoder()
y = le.fit_transform(y)
x_train,x_test,y_train,y_test = train_test_split(x,y,test_size=0.3,random_state=42)
abc = AdaBoostClassifier(n_estimators=50,learning_rate=1,random_state=42)
model1 = abc.fit(x_train,y_train)
y_pred = model1.predict(x_test)
y_pred

print("Adaboost Classifier Model Accuracy", accuracy_score(y_test,y_pred))

clf = DecisionTreeClassifier()
clf = clf.fit(x_train,y_train)
y_pred = clf.predict(x_test)
accuracy_score(y_test,y_pred)

Session 13 - Bagging Classification

Aim - To understand the bagging classification
Description - 

Code & Output -

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


Session 14 - Logistic Regression With K-Fold Cross Validation

Aim - To understand logistic regression with K-fold Cross Validation
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

Session 15 - K-Means Clustering

Aim - To understand the K-Means Clustering
Description - 

Code & Output -

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
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
df = pd.read_csv("Country-data.csv")
df.head()

df.isna().sum()

df.info()

ax1 = df.plot(kind = 'scatter', x = 'income', y = 'child_mort', color = 'g')
ax2 = df.plot(kind = 'scatter', x = 'income', y = 'life_expec', color = 'b', ax = ax1) # ax = ax1 because the 2nd plot should be drawn on the same axis


plt.legend(labels = ['Child Mortality', 'Life Expectancy'])
plt.ylabel('Child mortality / Life Expectancy')


plt.show()

plt.figure(figsize=(20,10))
plt.subplot(2,4,1)
plt.scatter(df.child_mort,df.gdpp)
plt.xlabel("child_mort")
plt.ylabel("gdpp")


plt.subplot(2,4,2)
plt.scatter(df.exports,df.gdpp)
plt.xlabel("Exports")


plt.subplot(2,4,3)
plt.scatter(df.health,df.gdpp)
plt.xlabel("health")


plt.subplot(2,4,4)
plt.scatter(df.imports,df.gdpp)
plt.xlabel("Imports")


plt.subplot(2,4,5)
plt.scatter(df.inflation,df.gdpp)
plt.xlabel("Inflation")


plt.subplot(2,4,6)
plt.scatter(df.life_expec,df.gdpp)
plt.title("life_expec")


plt.subplot(2,4,7)
plt.scatter(df.total_fer,df.gdpp)
plt.title("total_fer")


plt.subplot(2,4,8)
plt.scatter(df.income,df.gdpp)
plt.title("Income")

Session 16 - Elbow Method

Aim - To understand the elbow method
Description - 

Code & Output -

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

Session 17 - Gradient Boosting Regressor

Aim - To understand gradient boosting regressor
Description - 

Code & Output -

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


