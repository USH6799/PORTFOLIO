import json
import requests

type = input("Enter the topic: ")

r = requests.get(url="https://newsapi.org/v2/everything?q={type}&from=2024-05-10&sortBy=publishedAt&apiKey=c3298104e4d84f0bb7fd6661daa8e15d") 

news = json.loads(r.text)

for topic in news['articles']:
    print(topic['title'])
    print(topic['description'])
    print("-----------------------------------")
