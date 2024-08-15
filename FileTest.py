def IsAvailable(path):
    try:
        open(path , 'r')
        
    except:
        print(path , " Not found")
        
def CheckComment(path , symbol):
    try:
        data = open(path , 'r').read()
        
    except:
        print(path , " Not found")

    if(data.count(symbol) < 10):
        print(path , " Not commented")
        
    else:
        pass
        
        
def Initiate(arr , ext , symbol):
    
    while True:
        
        start = arr.find("assets")
        
        
        end = arr.find(ext) + len(ext)
        
        if(start == -1 or end == -1):
            break
        
        path = arr[start : end]

        
        arr = arr[end : ]
        
        IsAvailable(path)
        CheckComment(path , symbol)
        
java = open('JAVA.html' , 'r').read().split('<main class="content">')[1].split('<div class="note">')[0]

python = open('PYTHON.html' , 'r').read().split('<main class="content">')[1].split('<div class="note">')[0]


java = java.strip()

python = python.strip()

Initiate(java , ".java" , "//")
Initiate(python , ".py" , "#")



        




        