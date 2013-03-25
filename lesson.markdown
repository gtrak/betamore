%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%  Start off with some headers

Title: Fruit from the tree of knowledge of good and java.
Author: Gary Trakhman

%%%%%%%%%%%%%%%%%%%%%%%%
%  Add some styles here
%

%css

body    { font-family: Helvetica; }
          
h1, h2, h3, h4, h5, h6 { color: #0050B0;  }

h1  { text-align: center; }


/* todo: use pre.class - needs to get added using @@@lang */
pre {
  background-color: white;
  border: 2px solid #B05000;
  padding: 10px;
}

div.code {
  background-color: white;
  border: 2px solid #B05000;
  padding: 10px; 
}

div.code pre {
  background-color: white; 
  border: 0;
  padding: 5px;
}

%end

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%  Let's go. The presentation starts here

#Fruit from the tree of knowledge of good and java.

Gary Trakhman
%class center

Template stolen from [GitHub](https://github.com/geraldb/slideshow/blob/master/samples/3rd/10things.text)
%class center

---

{{ help }}


# About Me

## Who am I?
* Gary Trakhman
* Programmer for Revelytix
* Java abuser
* Clojure Enthusiast

## How did I get here?
* Some excellent coursework
* Lots of reading
* Long-term commitment
* Curiousity to see what's underneath
* Availability of open-source code and willingness of community members to share knowledge

#Programming History

##Languages I've worked seriously with, in order
* QBasic (age 8)
* C++ (high-school project)
* Scheme: (2003, freshman year of college at GT, [HtDP](http://htdp.org/2003-09-26/Book/curriculum-Z-H-1.html#node_toc_start))
* Matlab
* C (2007)
* Verilog
* C++ (2008, for real this time)
* C# (2008)
* Python (2008-2010)
* Adobe AS3 (2009-2010, Flex)
* Java (2009-...)
* Clojure (2011-now, what I consider my primary language)

## Currently working on
* webapps
* backend services
* hadoop query stuff

# Interests

## What I enjoy about programming
* figuring stuff out
* tasteful design
* identifying tradeoffs, making them explicit
* making stuff go fast
* making my life easier

## Future interests
* Logic Programming
* Haskell
* Mixed-style and mixed-compilation programming 
* Client-side
* Larger-scale programming architecture

# This class
* Trees
* Recursion
* Iteration
* Program Design
* Java Specifics

* _I think recursion is fundamental to understanding programming.  Lots of programmers I look up to do as well._

# Trees

## They're everywhere, what's interesting about them?

%left
Depth-first traversal

![Depth-first traversal](http://upload.wikimedia.org/wikipedia/commons/9/9d/Sorted_binary_tree_postorder.svg)
%end 

%right
Breadth-first traversal
 
 
<img src="http://upload.wikimedia.org/wikipedia/commons/4/46/Animated_BFS.gif" width="300">
%end

## Useful things to do to trees
* visit every node and grab some information from it
* create a subtree
* add nodes
* sort it
* move nodes around

* All can be implemented with recursion

# Trees don't have cycles

# Trees don't have cycles


%left 
graphs do.

%end

%right
![a graph](http://web.cecs.pdx.edu/~sheard/course/Cs163/Graphics/graph1.png)
%end


# Quote

> A language that doesn't affect the way you think about programming
> is not worth knowing  -- Alan Perlis 

# More Examples
XML

<pre><span class="nt">&lt;shiporder</span> <span class="na">orderid=</span><span class="s">&quot;889923&quot;</span>
<span class="na">xmlns:xsi=</span><span class="s">&quot;http://www.w3.org/2001/XMLSchema-instance&quot;</span>
<span class="na">xsi:noNamespaceSchemaLocation=</span><span class="s">&quot;shiporder.xsd&quot;</span><span class="nt">&gt;</span>
  <span class="nt">&lt;orderperson&gt;</span>John Smith<span class="nt">&lt;/orderperson&gt;</span>
  <span class="nt">&lt;shipto&gt;</span>
    <span class="nt">&lt;name&gt;</span>Ola Nordmann<span class="nt">&lt;/name&gt;</span>
    <span class="nt">&lt;address&gt;</span>Langgt 23<span class="nt">&lt;/address&gt;</span>
    <span class="nt">&lt;city&gt;</span>4000 Stavanger<span class="nt">&lt;/city&gt;</span>
    <span class="nt">&lt;country&gt;</span>Norway<span class="nt">&lt;/country&gt;</span>
  <span class="nt">&lt;/shipto&gt;</span>
  <span class="nt">&lt;item&gt;</span>
    <span class="nt">&lt;title&gt;</span>Empire Burlesque<span class="nt">&lt;/title&gt;</span>
    <span class="nt">&lt;note&gt;</span>Special Edition<span class="nt">&lt;/note&gt;</span>
    <span class="nt">&lt;quantity&gt;</span>1<span class="nt">&lt;/quantity&gt;</span>
    <span class="nt">&lt;price&gt;</span>10.90<span class="nt">&lt;/price&gt;</span>
  <span class="nt">&lt;/item&gt;</span>
  <span class="nt">&lt;item&gt;</span>
    <span class="nt">&lt;title&gt;</span>Hide your heart<span class="nt">&lt;/title&gt;</span>
    <span class="nt">&lt;quantity&gt;</span>1<span class="nt">&lt;/quantity&gt;</span>
    <span class="nt">&lt;price&gt;</span>9.90<span class="nt">&lt;/price&gt;</span>
  <span class="nt">&lt;/item&gt;</span>
<span class="nt">&lt;/shiporder&gt;</span>
</pre>

# More examples 2

Java:

    for(num2 = 0; num2 <= 3;  num2++){
        for(num1 = 0; num1 <= 2; num1++){
            System.out.println(num2 + "   " + num1);
        }
    }              

Ruby:

    a.each do |b|
      c=0
      d.each do |e|
        if a == d
          c += 1
        end
      end
      if c > 1
        e << a
      end
    end

Lisp:

    (defn update-in*
      [m keys f & args]
      (if-let [[k & ks] (seq keys)]
        (let [old (get m k)
              new (apply update-in* old ks f args)]
          (if (identical? old new)
            m
            (assoc m k new)))
        (apply f m args)))

# How code works

* We write code as a tree, for our convenience

* A compiler/interpretation parses it and converts it to another data format for running on a real machine

* Execution (running) is not necessarily tree-like

* The machine runs your code effectively line-by-line (each line of translated output, a machine instruction).  Anything that tells it to switch to a line previously encountered creates a cycle, therefore it's no longer a tree.

* Being able to execute code in your head is unfortunately essential to good design and debugging ability.
That means we have to understand the order of things happening in our programs.


# A simple example

    public static void println(Object u){
        System.out.println(u);
    }

    public static String slurp(URL url) throws IOException {
        InputStream is = url.openStream();
        Reader r = new InputStreamReader(is);
        try {
            StringBuilder b = new StringBuilder();
            for(;;){
                int c = r.read();
                if (c<0) {
                    break;
                }
                b.append((char)c);
            }
            return b.toString();
        } finally {
            is.close();
            r.close();
        }
    }

    public static void main(String[] args) throws Exception {
        URL start = new URL("http://en.wikipedia.org/wiki/America");
        println(slurp(start));
    }

# A simple example while running

    public static void println(Object u){
        *19* System.out.*21* println(*20* u);
    }

    public static String slurp(URL url) throws IOException {
        *7* InputStream is = *6* url.openStream();
        *10* Reader r = *9* new InputStreamReader(*8* is);
        try {
            *12* StringBuilder b = *11* new StringBuilder();
            //Loops, don't go inside, hard to number :-)
            *13* for(;;){
                int c = r.read();
                if (c<0) {
                    break;
                }
                b.append((char)c);
            }
            *15* return b.*14* toString();
        } finally {
            *16* is.close();
            *17* r.close();
        }
    }

    public static void main(*1* String[] args) throws Exception {
        *4* URL start = *3* new URL(*2* "http://en.wikipedia.org/wiki/America");
        println(*18* slurp(*5* start));
    }

    *0* - The JVM calls our "main" function and passes it the arguments

# A more complicated example

[Factorial Demo](http://www.animatedrecursion.com/simple/fact.html)

## Rules
* Function parameters are passed by value
* Getting the value of something is called 'evaluating' it.
* Sometimes you do extra work to evaluate a value, eg. calling the function.

# Look back at the simple example
* Parameter passing
* Control-flow
* Return values
* Objects? in a bit.

# RECURSION
* What is recursion?

See _recursion_.

#A word on stacks
[Wikipedia](http://en.wikipedia.org/wiki/Call_stack)

![Call Stack](http://www.senocular.com/flash/tutorials/asyncoperations/images/recursion_function.png)

# Recursion
* Raw Recursion looks like a tree
* Recursion that doesn't spread looks like a sequence
* A sequence can be thought of as a special case of a tree, where each node only has one child.

<pre>
1 - 2 - 3 - 4


    1
  .   2
 ..  .  3
    ..  . 4
</pre>

# RECURSION
* What is recursion?

See _recursion_.

# Iteration
* Equivalent to recursion, except you manage the stack yourself (if needed)
* Out of the box, just like a non-stack-consuming tail recursion.
* Loops

A function that iterates across a passed in list, returning a new list with only the elements that match a passed in condition (predicate). 

    public static List filter(IFn<Boolean> pred, List list){
        List out = new ArrayList();
        for(Object x : list){
            if(pred.invoke(x)){
                out.add(x);
            }
        }
        return out;
    }

* No extra information is needed for each step of the loop counter, so we just do the work at each step.
* Every element in the input list is touched once

# Structured data
* We can group related data together as a single thing

<pre>
    Person Name
    Address
    Birthday
</pre>
    
# In java, we create structured data with classes

    class Person{
      String name;
      String address;
      Date birthday;

      Person(String name, String address, Date birthday){
        this.name = name;
        this.address = address;
        this.birthday = birthday;
      }     
    }
    ...
    Person gary = new Person("Gary","SomeAddress", Date.valueOf("1984-12-23"));

# Classes are templates for objects
* You can create objects with 'new', calling the appropriate constructor.

* Fields must be initialized during object creation.  Constructors usually do this.

* A default no-arg(parameter) constructor is available invisibly: new MyClass();

* Objects take up space on the 'heap'.  The memory is freed automatically when they are no longer referenced.  The 'garbage collector' is part of the JVM and handles this for you.  C programmers still manage their own memory.

* If there's something you don't know how to do, java's answer is usually to 'use an object'.

* All methods are defined within a class, methods that aren't static rely on a constructed object, and have 'this' bound to that object.

* MyClass.staticMethod();

* new MyClass().objectMethod();
* MyClass a = new MyClass(); a.objectMethod();

# Before we go any further

Some definitions

* Top-down 'something' - an approach to 'something' that starts at the root and expands (recursive)

* Bottom-up 'something' - an approach to 'something' that starts at the bottom-most leafs and composes (recursive if you squint)

Learning anything can only be accomplished bottom-up, unless you already have a starting point (a root) (another language under your belt, or some other context).

* Top-down is about foresight and relevance

* Bottom-up is about comprehensiveness

# Top-down design

Sussman, SICP - _We are using here a powerful strategy of synthesis: wishful thinking._ 

    // A simple file downloader
    public static void main(String[] args) throws Exception {
        URL start = new URL("http://en.wikipedia.org/wiki/America");
        println(slurp(start));
    }

* We wrote the main function while pretending println and slurp exist.  In order for the program to run, we have to make them exist.

* This style is supported in java by the use of stubs that do nothing in place of a real future implementation, this lets us compile and test without the program being fully completed.

# Bottom-down design

* We enumerate some components, and work on them individually. Wiring them up happens at the end, so the 'main' function from the last slide would have been created at the end of our process.

# Real life

* In real life, we mix and match approaches whenever appropriate.  

* I generally write things bottom-up, using top-down at specification boundaries, or explicit 'contracts' between components.

# Learning a Language
* Figure out what everything does, focusing on the most import concepts and the most common idioms of the language.

* Focus on semantics and contracts (what things do and imply), not only on syntax.  Write things in the simplest and least ambiguous way possible until you have more control over abstraction.

* Identify the experts, and read things written by them.  Avoid noise.

* paraphrasing my high school band teacher - _Practice doesn't make perfect, practice makes permanent.  Perfect practice makes perfect._

* It's better to do correct things slowly than rush something out.  If you'll ever have to see it again, bad code is a liability.

* Understand what you're doing before you spend a lot of effort solidifying it.

* Read the implementation of things you use.  It's the only way to explain weird behaviors sometimes, and you will gain confidence about the systems you're using and be able to make design judgments yourself, while identifying the tradeoffs at play in code provided by others.  

* Check out [what Norvig has to say on the subject.](http://norvig.com/21-days.html)

* If you've done all you can yourself, then and only then ask for help.  Sticking to this rule makes you faster at solving your own problems and makes coworkers like you more.

* Don't worry, today is an exception. Ask for help freely, but struggling a bit will make an answer stick better.

# Compilation

_demo_

* Our project today is built with gradle for convenience.  Gradle does the duties of assembling a classpath, compiling and running your code in one step.

* On linux/OSX - "./gradlew -Pmain=YourClass"
* On Windows - "gradlew.bat -Pmain=YourClass"

# Resources
* Princeton CS Java CheatSheet: [http://introcs.cs.princeton.edu/java/11cheatsheet/](http://introcs.cs.princeton.edu/java/11cheatsheet/)

* Just a high-quality treatment of basic CS in Java: [http://introcs.cs.princeton.edu/java/home](http://introcs.cs.princeton.edu/java/home)

## For the bored
* Effective Java: [http://www.amazon.com/Effective-Java-2nd-Joshua-Bloch/dp/0321356683](http://www.amazon.com/Effective-Java-2nd-Joshua-Bloch/dp/0321356683)

* JCIP: [http://www.amazon.com/Java-Concurrency-Practice-Brian-Goetz/dp/0321349601/ref=sr_1_1?s=books&ie=UTF8&qid=1364146079&sr=1-1&keywords=jcip](http://www.amazon.com/Java-Concurrency-Practice-Brian-Goetz/dp/0321349601/ref=sr_1_1?s=books&ie=UTF8&qid=1364146079&sr=1-1&keywords=jcip)

## For the super-bored
* The Joy of Clojure: [http://joyofclojure.com/](http://joyofclojure.com/)

# Thanks