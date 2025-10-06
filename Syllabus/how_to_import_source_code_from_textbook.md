# 📥 Downloading and Importing Textbook Source Code

## Overview

This guide will walk you through the process of downloading the source code from the textbook and importing it into Eclipse IDE. The source code contains all the example programs from each chapter, which you can use to follow along with the lessons.

---

## 📚 Step 1: Download the Source Code

### Download Link
The source code for the textbook is available at:

**🔗 [Download Source Code](https://media.pearsoncmg.com/ph/esm/ecs_gaddis_sowjava_cso_7/cw/content/Source_Code.zip)**

### Instructions

1. **Click the download link** above
2. **Save the ZIP file** to your computer (recommended: save to your Downloads folder)
3. **Extract the ZIP file**:
   - Right-click on `Source_Code.zip`
   - Select "Extract All..." (Windows) or double-click (Mac)
   - Choose a location to extract (recommended: create a folder like `C:\JavaSourceCode`)
4. **Verify the contents**:
   - You should see folders organized by chapter (Chapter 01, Chapter 02, etc.)
   - Each chapter folder contains Java code listings (`.java` files)

---

## 💻 Step 2: Import Source Code into Eclipse

### Quick Summary

```
Create Project → Copy Chapter Files → Paste in Eclipse → Run
```

### Detailed Steps

#### 1️⃣ Create a New Project in Eclipse

- Open Eclipse IDE
- Go to `File` → `New` → `Java Project`
- Name your project (for example: `CS0_Chapter_2_Java_Fundamentals`)
- Click `Finish`

#### 2️⃣ Navigate to the Source Code Directory

- Open **Windows Explorer** (File Explorer)
- Navigate to the extracted source code folder
- Open the chapter folder you want to import (for example: `Chapter 02`)

#### 3️⃣ Select and Copy All Files

- Press **`Ctrl + A`** to select all Java files in the chapter folder
- Press **`Ctrl + C`** to copy all selected files

#### 4️⃣ Navigate to Your Eclipse Project

- In Eclipse, expand your project in the Package Explorer
- Find and expand the **`src`** folder

#### 5️⃣ Paste the Files

- Click on the **`src`** folder to select it
- Press **`Ctrl + V`** to paste all the copied files
- Eclipse will automatically import the files

#### 6️⃣ Run the Programs

- You should now see all the Java files in your project
- Right-click on any `.java` file
- Select `Run As` → `Java Application`
- View the output in the Console window

---

## 🎥 Video Tutorial

For a visual walkthrough of this process, watch this helpful tutorial:

**📺 [YouTube Tutorial: Importing Source Code into Eclipse](https://www.youtube.com/watch?v=tuRoTkWJWr4)**

---

## 💡 Tips

### Best Practices

- **Create separate projects** for each chapter to keep your workspace organized
  - Example: `Chapter_02_Fundamentals`, `Chapter_03_Decisions`, etc.
- **Explore the code** before running it to understand what each program does
- **Experiment** by modifying the code and observing the changes

### Project Naming Convention

```
CS0_Chapter_[Number]_[Topic]

Examples:
- CS0_Chapter_01_Introduction
- CS0_Chapter_02_Java_Fundamentals
- CS0_Chapter_03_Decision_Structures
- CS0_Chapter_04_Loops_and_Files
```

---

## ⚠️ Troubleshooting

### Common Issues and Solutions

| Problem | Solution |
|---------|----------|
| Files won't paste | Make sure you're pasting into the `src` folder, not the project root |
| Compilation errors | Ensure you selected the correct chapter folder |
| Can't find main method | Look for files with `public static void main(String[] args)` |
| Java version mismatch | Right-click project → Properties → Java Compiler → Check version |

### Need Help?

If you encounter issues:
1. Watch the video tutorial again
2. Ask your instructor for assistance
3. Check Eclipse error messages in the Problems view
4. Ensure you have the correct JDK installed

---

## ✅ Checklist

Use this checklist to ensure you've completed all steps:

- [ ] Downloaded the source code ZIP file
- [ ] Extracted the ZIP file to a known location
- [ ] Created a new project in Eclipse
- [ ] Copied files from the chapter folder
- [ ] Pasted files into the Eclipse `src` folder
- [ ] Verified all files appear in Package Explorer
- [ ] Successfully ran at least one program
- [ ] Watched the video tutorial (optional but recommended)

---

## 📁 Expected Folder Structure

After importing, your Eclipse workspace should look like this:

```
CS0_Chapter_02_Java_Fundamentals/
├── src/
│   ├── Comment1.java
│   ├── Comment2.java
│   ├── Variable.java
│   ├── StringLiteral.java
│   └── ... (other chapter 2 files)
└── bin/
    └── ... (compiled .class files)
```

---

**Happy Coding! 🚀**
