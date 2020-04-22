import pandas as pd
import glob

data_urls = glob.glob("../../../../datasets/*.csv")

print("The dataset files ", data_urls)

for idx, file in enumerate(data_urls) :
    print(f"**************** {file} ************")
    github_data = pd.read_csv(file)
    print(github_data.shape)
    print(github_data.head(5))

    stack_data_code = []

    if idx == 2:
        stack_data = pd.read_csv(file)
        #with open("stack_data_code.java", "w") as so :
        print(stack_data["full_code_snippet"].values)
        stack_data_code = stack_data["full_code_snippet"].values
            #so.write(stack_data["full_code_snippet"].values)

    stack_code_all = ""
    for idx, code in enumerate(stack_data_code) :
        #stack_code_all += code + "\n"
        with open("stack_data_code_"+ str(idx) +".java", "w") as so:
            so.write(code)


