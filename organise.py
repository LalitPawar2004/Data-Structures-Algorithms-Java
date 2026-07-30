import os
import glob
import shutil

# Dictionary format: "OldFileName.java": ("folder_name", "NewFileName.java", "// Q. Comment")
file_mapping = {
    # Arrays
    "ArrayAverage.java": ("arrays", "ArrayAverage.java", "// Q. Write a program to find the average of elements in an array.\n"),
    "ArrayCount.java": ("arrays", "ArrayCount.java", "// Q. Write a program to count the occurrence of elements in an array.\n"),
    "ArrayName.java": ("arrays", "ArrayName.java", "// Q. Write a program to store and print names in an array.\n"),
    "ArrayReverse.java": ("arrays", "ArrayReverse.java", "// Q. Write a program to reverse an array.\n"),
    "ArraySearch.java": ("arrays", "ArraySearch.java", "// Q. Write a program to search for a specific element in an array.\n"),
    "ArraySum.java": ("arrays", "ArraySum.java", "// Q. Write a program to calculate the sum of all elements in an array.\n"),
    "SortedArray.java": ("arrays", "CheckSortedArray.java", "// Q. Write a program to check if an array is sorted in ascending order.\n"),
    "MinMax.java": ("arrays", "MinMaxArray.java", "// Q. Write a program to find the minimum and maximum elements in an array.\n"),

    # Basics
    "Calculator.java": ("basics", "Calculator.java", "// Q. Create a basic calculator to perform addition, subtraction, multiplication, and division.\n"),
    "CircleAreaCalculator.java": ("basics", "CircleArea.java", "// Q. Calculate the area of a circle for a given radius.\n"),
    "CricleArea.java": ("basics", "CircleArea.java", "// Q. Calculate the area of a circle for a given radius.\n"),
    "Compare.java": ("basics", "CompareNumbers.java", "// Q. Compare two numbers and find the largest.\n"),
    "Counter.java": ("basics", "Counter.java", "// Q. Write a simple counter program.\n"),
    "Dowhile.java": ("basics", "DoWhileExample.java", "// Q. Demonstrate the use of a do-while loop.\n"),
    "EvenNumbersTillN.java": ("basics", "EvenNumbersTillN.java", "// Q. Print all even numbers up to N.\n"),
    "Fibonacci.java": ("basics", "Fibonacci.java", "// Q. Print the Fibonacci sequence up to N terms.\n"),
    "Hello.java": ("basics", "Hello.java", "// Q. Print Hello World to the console.\n"),
    "MonthNamePrinter.java": ("basics", "MonthNamePrinter.java", "// Q. Print the name of the month based on the user's input (1-12).\n"),
    "MultiplicationTable.java": ("basics", "MultiplicationTable.java", "// Q. Print the multiplication table of a given number.\n"),
    "Power.java": ("basics", "PowerCalculation.java", "// Q. Calculate the power of a number (x^n).\n"),
    "PrimeOrNot.java": ("basics", "PrimeOrNot.java", "// Q. Check if a given number is a prime number or not.\n"),
    "StudentMarksMenu.java": ("basics", "StudentMarksMenu.java", "// Q. Create a menu-driven program to manage and display student marks.\n"),
    "SumOdd.java": ("basics", "SumOfOddNumbers.java", "// Q. Find the sum of all odd numbers up to N.\n"),
    "Vote.java": ("basics", "VotingEligibility.java", "// Q. Check if a person is eligible to vote (age >= 18).\n"),

    # Functions
    "AverageUsingFunction.java": ("functions", "AverageUsingFunction.java", "// Q. Write a function to calculate the average of numbers.\n"),
    "EvenUsingFunction.java": ("functions", "EvenUsingFunction.java", "// Q. Write a function to check if a number is even.\n"),
    "PrimeUsingFunction.java": ("functions", "PrimeUsingFunction.java", "// Q. Write a function to check if a number is prime.\n"),
    "TableUsingFunction.java": ("functions", "TableUsingFunction.java", "// Q. Write a function to print the multiplication table of a number.\n"),

    # Patterns
    "Half_Pyramid.java": ("patterns", "HalfPyramid.java", "// Q. Print a half pyramid pattern using stars or numbers.\n"),
    "Hollow_Butterfly.java": ("patterns", "HollowButterfly.java", "// Q. Print a hollow butterfly pattern.\n"),
    "Hollow_Rhombus.java": ("patterns", "HollowRhombus.java", "// Q. Print a hollow rhombus pattern.\n"),
    "Inverted_Pyramid.java": ("patterns", "InvertedPyramid.java", "// Q. Print an inverted pyramid pattern.\n"),
    "NumberPyramid.java": ("patterns", "NumberPyramid.java", "// Q. Print a number pyramid pattern.\n"),
    "PalindromicNumberPyramid.java": ("patterns", "PalindromicNumberPyramid.java", "// Q. Print a palindromic number pyramid pattern.\n"),
    "SolidRhombhus.java": ("patterns", "SolidRhombus.java", "// Q. Print a solid rhombus pattern.\n")
}

# 1. Delete all .class files
for class_file in glob.glob("*.class"):
    os.remove(class_file)
    print(f"Deleted: {class_file}")

# 2. Process all mapped Java files
for old_name, (folder, new_name, comment) in file_mapping.items():
    if os.path.exists(old_name):
        # Create folder if it doesn't exist
        os.makedirs(folder, exist_ok=True)
        
        new_file_path = os.path.join(folder, new_name)
        
        # Read the existing code
        with open(old_name, "r") as file:
            content = file.read()
        
        # Write the comment + existing code to the new location
        with open(new_file_path, "w") as file:
            file.write(comment + content)
            
        # Remove the old file
        os.remove(old_name)
        print(f"Moved and formatted: {old_name} -> {new_file_path}")

print("Organization complete!")