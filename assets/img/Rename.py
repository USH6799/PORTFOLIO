import os

os.chdir("./assets/img")


files = os.listdir()


for pic in files:
    ext = pic.split(".")[-1]
    if(ext == "png" or ext == "jpg" and not ext == "webp"):
        os.rename(pic , pic.split(".")[0] + ".webp")
        
    else:
        pass