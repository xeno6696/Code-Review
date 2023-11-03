import System.Environment
import Data.List
import Data.Map (argSet)

main = do
    args <- getArgs
    progName <- getProgName
    mapM putStrLn args
    putStrLn "The program name is:"
    putStrLn progName

