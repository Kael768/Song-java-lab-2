def song():
    object = [
        ("cat", "fiddle-i-fee"),
        ("hen", "chimmy-chuck, chimmy-chuck"),
        ("duck", "quack, quack"),
        ("goose", "hissy, hissy"),
        ("sheep", "baa, baa"),
        ("pig", "oink, oink")
    ]
    for all in object:
        print(f"Bought me a {all[0]} and the {all[0]} pleased me,")
        print(f"I fed my {all[0]} under yonder tree.")
        for item in object[:object.index(all)+1][::-1]:
            print(f"{item[0].capitalize()} goes {item[1]}")
        print()

def main():
    user = input("Please enter to see song")
    if user.lower() == "":
        song()
    else:
        print("Invalid input")
if __name__ == "__main__":
    main()
#can Java do this? 