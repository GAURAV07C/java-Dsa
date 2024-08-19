<h1 style="background-color: #FFFF00">🐍 Snake Movement in Grid 🐍
</h1> ========================== <h2>
  🤔 Problem Statement 🤔</h2>
  <h4>
There is a snake in an n x n matrix grid and can move in four possible directions 🔄. Each cell in the grid is identified by the position: grid[ i ][ j ] = (i * n) + j 📝.

The snake starts at cell 0 and follows a sequence of commands 📜.

You are given an integer n representing the size of the grid and an array of strings commands where each command[i] is either "UP", "RIGHT", "DOWN", and "LEFT" 📍. It's guaranteed that the snake will remain within the grid boundaries throughout its movement 🚫.

Return the position of the final cell where the snake ends up after executing commands 🏁.
 </h4>

<h3> 📚 Examples 📚 </h3>

<h3>Example 1  </h3> 
<h4>
Input: n = 2, commands = ["RIGHT","DOWN"]  </h4>

<h3>Output: 3 </h3> 

<h3>Explanation: </h3> 

<h3>0 | 1</h3> 

<h3>2 | 3</h3> 

<h3>Example 2 </h3>  
<h4> 

Input: n = 3, commands = ["DOWN","RIGHT","UP"] </h4>
<h3> 

Output: 1 </h3>
<h3> 

Explanation: </h3>
<h3> 

0 | 1 | 2

3 | 4 | 5

6 | 7 | 8
</h3>
<h4>

Constraints 2 <= n <= 10 1 <= commands.length <= 100 commands consists only of "UP", "RIGHT", "DOWN", and "LEFT" The input is generated such the snake will not move outside of the boundaries 🚫  </h4>
