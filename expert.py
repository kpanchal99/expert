import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression, LogisticRegression
from sklearn.naive_bayes import BernoulliNB
from sklearn.tree import DecisionTreeClassifier
from sklearn.model_selection import train_test_split
from sklearn.svm import SVC
from sklearn.neighbors import KNeighborsClassifier
from sklearn.metrics import confusion_matrix, precision_score, recall_score, accuracy_score, f1_score, classification_report
from sklearn.preprocessing import LabelEncoder
from sklearn.ensemble import AdaBoostClassifier
from sklearn.ensemble import BaggingClassifier
from sklearn.ensemble import GradientBoostingRegressor
from sklearn.model_selection import cross_val_score

# pre processing 
data = data.fillna(data.Col1.median())
data.isnull().sum()
data.info()
data.duplicated().sum()
data.describe()
data.dropna() # drop rows with nan
#Fills NaN values to 0
df.fillna(0)
#Fills NaN values 
newdf = df.fillna({
    'temperature':0,
    'windspeed': 0,
    'event': 'No event'
})
#Forward Fill
newdf = df.fillna(method="ffill")
# mean
newdf = df.interpolate()


# basic 

# apriori====================================================================================

# read csv > convert csv to list 

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

# linear , multiple linear ------------------------------------------------------------

plt.figure(dpi=150)
plt.xlabel('Flat Area')
plt.ylabel('Sales Price')
plt.scatter(df.Area,df.Price,marker="+",color="red")

reg = linear_model.LinearRegression()
reg.fit(df[['Area']],df.Price)
reg.coef_
reg.intercept_
# y = mx + c
y = reg.coef_* 1900 + reg.intercept_


# multi plot ====================================================================================
plt.scatter(df2.Area, df2.Price)
plt.scatter(df2.Bedroom, df2.Price)
plt.scatter(df2.Age, df2.Price)
plt.legend(labels=['Area', 'Bedroom', 'Age'])
plt.show()
# ====================================================================================
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



# Logistic ====================================================================================
model = LogisticRegression()
model.fit(data[['Age']],data.Purchased)
model.predict([[27]])


# navie bayes ====================================================================================

one_hot_data = pd.get_dummies(x ,  dtype=int)
BerNB = BernoulliNB()
train_df = BerNB.fit(one_hot_data,y)
prediction = train_df.predict([[0,1,1,0,1,0,0,0,1]])

# Decision Tree ====================================================================================

clf= tree.DecisionTreeClassifier()
clf
clf_train= clf.fit(x,y)
clf_train
tree.plot_tree(clf_train)
plt.show()
tree.plot_tree(clf_train, feature_names=list(x.columns.values),rounded=True, filled= True)
plt.show()
confusion_matrix(y_test, y_pred)
accuracy_score(y_test,y_pred)
precision= precision_score(y_test, y_pred, average= None)
recall= recall_score(y_test,y_pred, average= None)
F1_score= 2*(precision * recall)/ (precision + recall)

# K-Nearest Neighbour Classification ====================================================================================
# > do decisiontree classifier 

# object creation
KNN = KNeighborsClassifier()
KNN.fit(x_train,y_train)
y_pred=KNN.predict(x_test)
y_pred
accuracy_score(y_test,y_pred)


KNN= KNeighborsClassifier(n_neighbors=3,weights='distance',p=2,metric='euclidean')
KNN.fit(x_train,y_train)
y_pred=KNN.predict(x_test)
accuracy_score(y_test,y_pred)


KNN= KNeighborsClassifier(n_neighbors=2,weights='uniform',algorithm='brute')
KNN.fit(x_train,y_train)
y_pred=KNN.predict(x_test)
accuracy_score(y_test,y_pred)

# SVM ====================================================================================

#A Kernel is a function used in SVM for helping to solve problems
model = SVC(kernel = "rbf")
model.fit(x_train,y_train)
y_pred = model.predict(x_test)
model = SVC(kernel = "poly")
model = SVC(kernel = "rbf", gamma=15,C=7)
model.fit(x_train,y_train)

# Random Forest Classification ====================================================================================


# change that particulam colum into label encoder o,1,2,3,....
le = LabelEncoder()
y = le.fit_transform(y)

x_train,x_test,y_train,y_test = train_test_split(x,y,test_size=0.3,random_state=42)
abc = AdaBoostClassifier(n_estimators=50,learning_rate=1,random_state=42)
model1 = abc.fit(x_train,y_train)
y_pred = model1.predict(x_test)

clf = DecisionTreeClassifier()
clf = clf.fit(x_train,y_train)
y_pred = clf.predict(x_test)
accuracy_score(y_test,y_pred)

# Bagging ====================================================================================

df.describe().T
df.select_dtypes(include="object") # column with categorical data 
df.select_dtypes(object).columns
df_encodded = pd.get_dummies(df, columns=['Sex', 'ChestPainType', 'RestingECG', 'ExerciseAngina', 'ST_Slope'], drop_first="True")

df_encodded = pd.get_dummies(data=df, columns=['Sex', 'ChestPainType', 'RestingECG', 'ExerciseAngina', 'ST_Slope'])

y  = df_encodded["HeartDisease"]
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


# Logistic Regression With K-Fold Cross Validation
# ====================================================================================

model = LogisticRegression()
model.fit(data[['Age']],data.Purchased)
model.predict([[27]])
x_train,x_test,y_train,y_test = train_test_split(data[['Age']], data.Purchased, test_size = 0.2)
model.fit(x_train,y_train)
model.predict(x_test)
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

# K-Means Clustering ====================================================================================
from sklearn.cluster import KMeans
import warnings
warnings.filterwarnings('ignore')
df = pd.read_csv("income.csv")
plt.scatter(df.Age,df.Income)
km = KMeans(n_clusters = 3)
km
y_predict=km.fit_predict(df[['Age','Income']])
y_predict
df['Cluster'] = y_predict
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


# Elbow method====================================================================================
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

# Gradient Boosting method====================================================================================
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

# Above Error says that we can not apply accuracy_score metric on Regression as it is a metric that is used with classification.
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

# ways to upload file =================================================================================
from google.colab import files
uploaded = files.upload()

import io
df = pd.read_csv(io.BytesIO(uploaded['puchased_data.csv']))
print(df)

#mounting google drive
from google.colab import drive
drive.mount('/content/drive')
url = "https://media.githubusercontent.com/media/datablist/sample-csv-files/main/files/leads/leads-100.csv"
df1 = pd.read_csv(url)
