package com.example.practiceapp.Android.Others

/*
Moshi is a modern JSON library for Android, Java and Kotlin.
It makes it easy to parse JSON into Java and Kotlin classes:
Note:
The Kotlin examples of this README assume use of either Kotlin code
gen or KotlinJsonAdapterFactory for reflection. Plain Java-based reflection
is unsupported on Kotlin classes

Moshi is a JSON library for Android, Java, and Kotlin. It was developed by Square.
Moshi allows users to:
Parse JSON into Java and Kotlin classes
Serialize and deserialize JSON in an efficient and straightforward manner
Moshi can be considered the successor to GSON.
To use Moshi, you can:
Create a Moshi object
Create an adapter
Get output
Here are the steps to code Moshi in Android Studio:
Create a Moshi object
Moshi moshi = new Moshi.Builder().build();
Create an adapter
Type type = Types.newParameterizedType(List.class, Person.class);
JsonAdapter<List> adapter = moshi.adapter(type);
Get output
List<Person> persons = adapter.fromJson(jsonResponse);*/