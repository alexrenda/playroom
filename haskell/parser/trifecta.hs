module Main where

import Control.Monad
import Text.Trifecta

import Parsers
import Util

main :: IO ()
main = do
    paths <- getFiles
    forM_ paths $ \path -> do
        result <- parseFromFile parseDecls $ "jypes/" ++ path
        print result
