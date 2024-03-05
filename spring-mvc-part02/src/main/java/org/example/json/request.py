import requests
import json

url = "http://localhost:8080/part02/json/data"
person = {
    "name": "John Doe",
    "age": 30,
    "gender": "male"
}



header = {
    "Content-Type": "application/json"
}
json_person = json.dumps(person)
response = requests.post(url, data=json_person, headers=header)
print(json_person)
print(response.text)


# curl -X POST -H "Content-Type: application/json" -d '{"name": "John Dow", "age": 30, "gender": "male"}' http://localhost:8080/part02/json/data
