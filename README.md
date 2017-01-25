![](http://i.imgur.com/4trUctl.png) 
# RecyclerViewExample
Purdue CNIT 425 class presentation demo, just a super simple RecyclerView infinite scroll example

## Steps for Setting Up RecyclerView

1. Add the following lines to the app's build.gradle dependencies


    `compile 'com.android.support:design:25.1.0'`

    `compile 'com.android.support:recyclerview-v7:25.1.0'`

    `compile 'com.android.support:cardview-v7:25.1.0'`


2. Add RecyclerView in xml, make sure to include an ID to bind the view in activity
3. Create RecyclerView item xml
4. Create Adapter and OnScrollListener
5. Initialize RecyclerView, LinearLayoutManager, and Adapter in activity, and bind data to the Adapter
6. Set LinearLayoutManager's orientation
7. Bind Adapter to RecyclerView by setAdapter(), and LinearLayoutManager by setLayoutManager()
8. Initialize OnScrollListener
9. Override onLoadMore method of OnScrollListener by adding data to the original data and notify Adapter change of data to update view
10. Bind OnScrollListener with RecyclerView


## Bonus: ButterKnife
A simple field and method binding for Android views which uses annotation processing to generate boilerplate code.
[https://github.com/JakeWharton/butterknife](https://github.com/JakeWharton/butterknife)